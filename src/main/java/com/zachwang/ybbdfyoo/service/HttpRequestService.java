package com.zachwang.ybbdfyoo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zachwang.ybbdfyoo.model.request.RequestModel;
import com.zachwang.ybbdfyoo.utility.Constants;
import com.zachwang.ybbdfyoo.utility.DateUtil;
import com.zachwang.ybbdfyoo.utility.JsonConvertUtil;
import com.zachwang.ybbdfyoo.utility.SignatureUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HttpRequestService {
  private static final Logger LOG = LoggerFactory.getLogger(HttpRequestService.class);

  /**
   * 发送GET请求.
   *
   * @param url          url
   * @param requestModel GET请求参数对应实体
   * @return GET请求响应
   */
  public String doGet(String url, RequestModel requestModel) {
    try {
      Map<String, Object> paramMap = JsonConvertUtil.getParamMap(requestModel);
      return doGet(url, paramMap);
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 发送GET请求.
   *
   * @param url      url
   * @param paramMap GET请求参数
   * @return GET请求响应
   */
  public String doGet(String url, Map<String, Object> paramMap) {
    try {
      String requestParam = createRequestParam(paramMap);
      url = url + requestParam;
      URL getUrl = new URL(url);
      HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
      connection.setRequestMethod(Constants.GET_METHOD);
      connection.setRequestProperty(Constants.CONTENTTYPE, Constants.UTF8);
      connection.setConnectTimeout(10 * 1000);
      connection.connect();
      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),
          StandardCharsets.UTF_8));
      StringBuilder result = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        result.append(line);
      }
      reader.close();
      connection.disconnect();
      return result.toString();
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 创建GET请求的请求参数.
   *
   * @param paramMap 请求参数
   * @return 请求参数
   */
  public String createRequestParam(Map<String, Object> paramMap) {
    StringBuilder requestParam = new StringBuilder();
    for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
      requestParam.append(entry.getKey()).append(Constants.EQUALS_SYMBOL).append(entry.getValue())
          .append(Constants.AND_SYMBOL);
    }
    if (StringUtils.isNotBlank(requestParam.toString())) {
      requestParam = new StringBuilder(Constants.QUESTION_MARK
          + requestParam.substring(0, requestParam.length() - 1));
    } else {
      requestParam = new StringBuilder();
    }
    return requestParam.toString();
  }

  /**
   * 发送POST请求.
   *
   * @param url          url
   * @param requestModel POST请求参数
   * @param apiKey       apiKey
   * @param secretKey    secretKey
   * @return POST请求响应
   */
  public String doPost(String url, RequestModel requestModel,
                       String apiKey, String secretKey) {
    try {
      Map<String, Object> paramMap = JsonConvertUtil.getParamMap(requestModel);
      return doPost(url, paramMap, apiKey, secretKey);
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 发送POST请求的请求参数.
   *
   * @param url       url
   * @param paramMap  请求参数
   * @param apiKey    apiKey
   * @param secretKey secretKey
   * @return POST请求响应
   */
  public String doPost(String url, Map<String, Object> paramMap,
                       String apiKey, String secretKey) {
    try {
      String requestBodyStr = createRequestBody(paramMap, apiKey, secretKey);
      if (StringUtils.isBlank(requestBodyStr)) {
        LOG.debug("Create request body failed.");
        return null;
      }
      URL postUrl = new URL(url);
      HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
      connection.setDoOutput(true);
      connection.setDoInput(true);
      connection.setRequestMethod(Constants.POST_METHOD);
      connection.setRequestProperty(Constants.CONTENTTYPE, Constants.UTF8);
      connection.setUseCaches(false);
      connection.setInstanceFollowRedirects(true);
      connection.setRequestProperty(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON);
      connection.connect();
      OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(),
          StandardCharsets.UTF_8);
      LOG.info(requestBodyStr);
      writer.write(requestBodyStr);
      writer.flush();
      writer.close();
      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),
          StandardCharsets.UTF_8));
      StringBuilder result = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        result.append(line);
      }
      reader.close();
      connection.disconnect();
      return result.toString();
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 处理请求入参，添加ApiKey、时间和签名.
   *
   * @param paramMap  需要传递的参数
   * @param apiKey    ApiKey
   * @param secretKey SecretKey
   * @return 包含ApiKey、时间和签名的入参
   */
  public String createRequestBody(Map<String, Object> paramMap,
                                  String apiKey, String secretKey) {
    Map<String, Object> requestBody = new HashMap<>();
    if (StringUtils.isBlank(apiKey)) {
      LOG.debug("获取不到 ApiKey");
      return "";
    }
    if (StringUtils.isBlank(secretKey)) {
      LOG.debug("获取不到 SecretKey");
      return "";
    }
    requestBody.put(Constants.API_KEY, apiKey);
    requestBody.put(Constants.TIMESTAMP,
        DateUtil.getCurrentTimeStr(Constants.FORMAT_YYYY_MM_DD_HH_MM_SS));
    if (paramMap != null) {
      requestBody.put(Constants.DATA, JSON.toJSON(paramMap));
    } else {
      requestBody.put(Constants.DATA, JSON.toJSON(new HashMap<>()));
    }
    String signature = SignatureUtil.getSignature(JSONObject
        .parseObject(JSONObject.toJSONString(requestBody)), secretKey);
    requestBody.put(Constants.SIGN, signature);
    return JSONObject.toJSONString(requestBody);
  }
}
