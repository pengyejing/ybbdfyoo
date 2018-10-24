package com.zachwang.ybbdfyoo.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zachwang.ybbdfyoo.model.request.PublicBillQueryRequest;
import com.zachwang.ybbdfyoo.model.response.CommonResponse;
import com.zachwang.ybbdfyoo.model.response.PublicBillQueryResponse;
import com.zachwang.ybbdfyoo.utility.Constants;
import com.zachwang.ybbdfyoo.utility.JsonConvertUtil;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PublicService implements DfyooService {
  private static final Logger LOG = LoggerFactory.getLogger(PublicService.class);
  @Autowired
  private HttpRequestService httpRequestService;
  @Value("${dfyoo.baseurl}")
  private String baseUrl;
  @Value("${dfyoo.acctid}")
  private String acctId;
  @Value("${dfyoo.public.apikey}")
  private String apiKey;
  @Value("${dfyoo.public.secretkey}")
  private String secretKey;

  @Override
  public String getBaseUrl() {
    return baseUrl;
  }

  @Override
  public String getAcctId() {
    return acctId;
  }

  @Override
  public String getApiKey() {
    return apiKey;
  }

  @Override
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * 景点列表查询.
   *
   * @param request TicketScenicListRequest
   * @return CommonResponse
   */
  public CommonResponse<PublicBillQueryResponse> billQuery(
      PublicBillQueryRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.PUBLIC_BILL_QUERY), request, getApiKey(), getSecretKey());
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<PublicBillQueryResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }
}
