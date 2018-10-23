package com.zachwang.ybbdfyoo.utility;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignatureUtil {
  private static final Logger LOG = LoggerFactory.getLogger(SignatureUtil.class);

  private SignatureUtil() {
  }

  /**
   * 通过 JSONObject 生成 Signature.
   *
   * @param data      JSONObject
   * @param secretKey secretKey
   * @return Signature
   */
  public static String getSignature(JSONObject data, String secretKey) {
    data.remove(Constants.SIGN);
    List<String> keyValueList = new ArrayList<>();
    propertyFilter(null, data, keyValueList);
    Collections.sort(keyValueList);
    String formatText = StringUtils.join(keyValueList, Constants.AND_SYMBOL);
    String finalText = secretKey + Constants.AND_SYMBOL + formatText
        + Constants.AND_SYMBOL + secretKey;
    return getMd5(finalText).toUpperCase();
  }

  private static void propertyFilter(String key, Object value, List<String> list) {
    if (value == null) {
      return;
    }
    if (value instanceof JSONObject) {
      jsonObjectPropertyFilter((JSONObject) value, list);
    } else if (value instanceof JSONArray) {
      jsonArrayPropertyFilter(key, (JSONArray) value, list);
    } else if (value.toString().length() > 0 && key != null) {
      list.add(key.trim() + Constants.EQUALS_SYMBOL + value);
    }
  }

  private static void jsonObjectPropertyFilter(JSONObject value, List<String> list) {
    if (value.isEmpty()) {
      return;
    }
    Set<String> keySet = value.keySet();
    for (String str : keySet) {
      propertyFilter(str, value.get(str), list);
    }
  }

  private static void jsonArrayPropertyFilter(String key, JSONArray value, List<String> list) {
    if (value.isEmpty()) {
      return;
    }
    for (Object json : value) {
      propertyFilter(key, json, list);
    }
  }

  private static String getMd5(String message) {
    String md5 = "";
    try {
      MessageDigest md = MessageDigest.getInstance(Constants.MD5);
      byte[] input = message.getBytes(Charset.forName(Constants.UTF8));
      byte[] buff = md.digest(input);
      md5 = bytesToHex(buff);
    } catch (NoSuchAlgorithmException e) {
      LOG.debug(e.getMessage(), e);
    }
    return md5;
  }

  private static String bytesToHex(byte[] bytes) {
    StringBuilder md5 = new StringBuilder();
    int digital;
    for (byte b : bytes) {
      digital = b;
      if (digital < 0) {
        digital += 256;
      }
      if (digital < 16) {
        md5.append("0");
      }
      md5.append(Integer.toHexString(digital));
    }
    return md5.toString().toUpperCase();
  }
}
