package com.zachwang.ybbdfyoo.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zachwang.ybbdfyoo.model.request.RequestModel;

import java.io.IOException;
import java.util.Map;

public class JsonConvertUtil {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private JsonConvertUtil() {
  }

  public static <T> T readValue(String str, Class<T> clazz) throws IOException {
    return MAPPER.readValue(str, clazz);
  }

  public static <T> T readValue(String str, TypeReference<T> t) throws IOException {
    return MAPPER.readValue(str, t);
  }

  public static String toJson(Object o) throws JsonProcessingException {
    return MAPPER.writeValueAsString(o);
  }

  public static String toPrettyJson(Object o) throws JsonProcessingException {
    return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(o);
  }

  /**
   * 将一个Model转换成对应的Map.
   *
   * @param requestModel RequestModel
   * @return map
   * @throws IOException IOException
   */
  public static Map<String, Object> getParamMap(RequestModel requestModel) throws IOException {
    String requestModelStr = JsonConvertUtil.toJson(requestModel);
    return JsonConvertUtil.readValue(requestModelStr, new TypeReference<Map<String, Object>>() {
    });
  }
}
