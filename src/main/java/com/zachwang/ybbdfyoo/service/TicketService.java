package com.zachwang.ybbdfyoo.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zachwang.ybbdfyoo.model.request.TicketCanRefundRequest;
import com.zachwang.ybbdfyoo.model.request.TicketCancelOrderRequest;
import com.zachwang.ybbdfyoo.model.request.TicketCreateOrderNewRequest;
import com.zachwang.ybbdfyoo.model.request.TicketDetailRequest;
import com.zachwang.ybbdfyoo.model.request.TicketOrderDetailRequest;
import com.zachwang.ybbdfyoo.model.request.TicketOrderStatusRequest;
import com.zachwang.ybbdfyoo.model.request.TicketPrivilegeTicketListRequest;
import com.zachwang.ybbdfyoo.model.request.TicketScenicDetailRequest;
import com.zachwang.ybbdfyoo.model.request.TicketScenicListRequest;
import com.zachwang.ybbdfyoo.model.request.TicketSubmitOrderRequest;
import com.zachwang.ybbdfyoo.model.request.TicketTuiPiaoRequest;
import com.zachwang.ybbdfyoo.model.request.TicketVerifyOrderRequest;
import com.zachwang.ybbdfyoo.model.response.CommonResponse;
import com.zachwang.ybbdfyoo.model.response.TicketCanRefundResponse;
import com.zachwang.ybbdfyoo.model.response.TicketCreateOrderNewResponse;
import com.zachwang.ybbdfyoo.model.response.TicketDetailResponse;
import com.zachwang.ybbdfyoo.model.response.TicketOrderDetailResponse;
import com.zachwang.ybbdfyoo.model.response.TicketOrderStatusResponse;
import com.zachwang.ybbdfyoo.model.response.TicketPrivilegeTicketListResponse;
import com.zachwang.ybbdfyoo.model.response.TicketScenicDetailResponse;
import com.zachwang.ybbdfyoo.model.response.TicketScenicListResponse;
import com.zachwang.ybbdfyoo.model.response.TicketSubmitOrderResponse;
import com.zachwang.ybbdfyoo.model.response.TicketTuiPiaoResponse;
import com.zachwang.ybbdfyoo.model.response.TicketVerifyOrderResponse;
import com.zachwang.ybbdfyoo.utility.Constants;
import com.zachwang.ybbdfyoo.utility.JsonConvertUtil;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
  private static final Logger LOG = LoggerFactory.getLogger(TicketService.class);
  @Autowired
  private HttpRequestService httpRequestService;
  @Value("${dfyoo.ticket.baseurl}")
  private String baseUrl;
  @Value("${dfyoo.ticket.acctid}")
  private String acctId;
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

  /**
   * 景点列表查询.
   *
   * @param request TicketScenicListRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketScenicListResponse> scenicList(
      TicketScenicListRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_SCENIC_LIST), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketScenicListResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 景点详情.
   *
   * @param request TicketScenicDetailRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketScenicDetailResponse> scenicDetail(
      TicketScenicDetailRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_SCENIC_DETAIL), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketScenicDetailResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 特权门票查询.
   *
   * @param request TicketPrivilegeTicketListRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketPrivilegeTicketListResponse> privilegeTicketList(
      TicketPrivilegeTicketListRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_PRIVILEGE_TICKET_LIST), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketPrivilegeTicketListResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 门票详情.
   *
   * @param request TicketDetailRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketDetailResponse> detail(
      TicketDetailRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_DETAIL), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketDetailResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 创建订单.
   *
   * @param request TicketCreateOrderNewRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketCreateOrderNewResponse> createOrderNew(
      TicketCreateOrderNewRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_CREATE_ORDER_NEW), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketCreateOrderNewResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 取消订单.
   *
   * @param request TicketCancelOrderRequest
   * @return Response
   */
  public String cancelOrder(TicketCancelOrderRequest request) {
    return httpRequestService.doPost(
        handleRequestUrl(Constants.TICKET_CANCEL_ORDER), request, apiKey, secretKey);
  }

  /**
   * 出票（代扣）.
   *
   * @param request TicketSubmitOrderRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketSubmitOrderResponse> submitOrder(
      TicketSubmitOrderRequest request) {
    try {
      request.setAcctId(acctId);
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_SUBMIT_ORDER), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketSubmitOrderResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 订单详情.
   *
   * @param request TicketOrderDetailRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketOrderDetailResponse> orderDetail(
      TicketOrderDetailRequest request) {
    try {
      request.setAcctId(acctId);
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_ORDER_DETAIL), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketOrderDetailResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 订单状态.
   *
   * @param request TicketOrderStatusRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketOrderStatusResponse> orderStatus(
      TicketOrderStatusRequest request) {
    try {
      request.setAcctId(acctId);
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_ORDER_STATUS), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketOrderStatusResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 核销查询.
   *
   * @param request TicketVerifyOrderRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketVerifyOrderResponse> verifyOrder(
      TicketVerifyOrderRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_VERIFY_ORDER), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketVerifyOrderResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 核损.
   *
   * @param request TicketCanRefundRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketCanRefundResponse> canRefund(
      TicketCanRefundRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_CAN_REFUND), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketCanRefundResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 退票申请.
   *
   * @param request TicketTuiPiaoRequest
   * @return CommonResponse
   */
  public CommonResponse<TicketTuiPiaoResponse> tuiPiao(
      TicketTuiPiaoRequest request) {
    try {
      String responseJson = httpRequestService.doPost(
          handleRequestUrl(Constants.TICKET_TUI_PIAO), request, apiKey, secretKey);
      return JsonConvertUtil.readValue(responseJson,
          new TypeReference<CommonResponse<TicketTuiPiaoResponse>>() {
          });
    } catch (IOException e) {
      LOG.debug(e.getMessage(), e);
    }
    return null;
  }
}
