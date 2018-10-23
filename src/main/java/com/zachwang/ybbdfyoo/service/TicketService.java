package com.zachwang.ybbdfyoo.service;

import com.zachwang.ybbdfyoo.model.request.TicketCreateOrderNewRequest;
import com.zachwang.ybbdfyoo.model.request.TicketDetailRequest;
import com.zachwang.ybbdfyoo.model.request.TicketPrivilegeTicketListRequest;
import com.zachwang.ybbdfyoo.model.request.TicketScenicDetailRequest;
import com.zachwang.ybbdfyoo.model.request.TicketScenicListRequest;
import com.zachwang.ybbdfyoo.utility.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
  @Autowired
  private HttpRequestService httpRequestService;
  @Value("${dfyoo.ticket.baseurl}")
  private String baseUrl;
  @Value("${dfyoo.ticket.apikey}")
  private String apiKey;
  @Value("${dfyoo.ticket.secretkey}")
  private String secretKey;

  /**
   * 生成请求的URL.
   *
   * @param url url
   * @return 可以用于请求的URL
   */
  public String handleRequestUrl(String url) {
    if (url.startsWith("http://") || url.startsWith("https://")) {
      return url;
    }
    return baseUrl + url;
  }

  public String scenicList(String key, Integer page, Integer pageSize) {
    TicketScenicListRequest request = new TicketScenicListRequest(key, page, pageSize);
    return httpRequestService.doPost(handleRequestUrl(Constants.TICKET_SCENIC_LIST), request, apiKey, secretKey);
  }

  public String scenicDetail(String scenicId) {
    TicketScenicDetailRequest request = new TicketScenicDetailRequest(scenicId);
    return httpRequestService.doPost(handleRequestUrl(Constants.TICKET_SCENIC_DETAIL), request, apiKey, secretKey);
  }

  public String privilegeTicketList(Integer page, Integer pageSize) {
    TicketPrivilegeTicketListRequest request = new TicketPrivilegeTicketListRequest(page, pageSize);
    return httpRequestService.doPost(handleRequestUrl(Constants.TICKET_PRIVILEGE_TICKET_LIST), request, apiKey, secretKey);
  }

  public String detail(Integer productId) {
    TicketDetailRequest request = new TicketDetailRequest(productId);
    return httpRequestService.doPost(handleRequestUrl(Constants.TICKET_DETAIL), request, apiKey, secretKey);
  }

  public String createOrderNew(TicketCreateOrderNewRequest request) {
    return httpRequestService.doPost(handleRequestUrl(Constants.TICKET_CREATE_ORDER_NEW), request, apiKey, secretKey);
  }
}
