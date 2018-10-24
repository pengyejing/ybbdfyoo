package com.zachwang.ybbdfyoo.service;

public interface DfyooService {
  String getBaseUrl();

  String getAcctId();

  String getApiKey();

  String getSecretKey();

  /**
   * 生成请求的URL.
   *
   * @param url url
   * @return 可以用于请求的URL
   */
  default String handleRequestUrl(String url) {
    if (url.startsWith("http://") || url.startsWith("https://")) {
      return url;
    }
    return getBaseUrl() + url;
  }
}
