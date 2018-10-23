package com.zachwang.ybbdfyoo.controller;

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
import com.zachwang.ybbdfyoo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketApi {
  @Autowired
  private TicketService ticketService;

  /**
   * 景点列表查询接口.
   *
   * @param key      查询关键字,城市或者景点名称
   * @param page     第几页.页从1开始
   * @param pageSize 分页大小
   * @return 景点列表
   */
  @GetMapping(value = "/scenic/list")
  public CommonResponse<TicketScenicListResponse> scenicList(
      @RequestParam String key, @RequestParam Integer page, @RequestParam Integer pageSize) {
    TicketScenicListRequest request = new TicketScenicListRequest(key, page, pageSize);
    return ticketService.scenicList(request);
  }

  /**
   * 景点列表查询接口.
   *
   * @param request TicketScenicListRequest
   * @return 景点列表
   */
  @PostMapping(value = "/scenic/list")
  public CommonResponse<TicketScenicListResponse> scenicList(
      @RequestBody TicketScenicListRequest request) {
    return ticketService.scenicList(request);
  }

  /**
   * 景点详情查询接口.
   *
   * @param scenicId 景点ID
   * @return 景点详情
   */
  @GetMapping(value = "/scenic/detail")
  public CommonResponse<TicketScenicDetailResponse> scenicDetail(
      @RequestParam String scenicId) {
    TicketScenicDetailRequest request = new TicketScenicDetailRequest(scenicId);
    return ticketService.scenicDetail(request);
  }

  /**
   * 景点详情查询接口.
   *
   * @param request TicketScenicDetailRequest
   * @return 景点详情
   */
  @PostMapping(value = "/scenic/detail")
  public CommonResponse<TicketScenicDetailResponse> scenicDetail(
      @RequestBody TicketScenicDetailRequest request) {
    return ticketService.scenicDetail(request);
  }

  /**
   * 特权门票查询接口.
   *
   * @param page     第几页.页从1开始
   * @param pageSize 分页大小
   * @return 特权门票
   */
  @GetMapping(value = "/privilege/ticket/list")
  public CommonResponse<TicketPrivilegeTicketListResponse> privilegeTicketList(
      @RequestParam Integer page, @RequestParam Integer pageSize) {
    TicketPrivilegeTicketListRequest request = new TicketPrivilegeTicketListRequest(page, pageSize);
    return ticketService.privilegeTicketList(request);
  }

  /**
   * 特权门票查询接口.
   *
   * @param request TicketPrivilegeTicketListRequest
   * @return 特权门票
   */
  @PostMapping(value = "/privilege/ticket/list")
  public CommonResponse<TicketPrivilegeTicketListResponse> privilegeTicketList(
      @RequestBody TicketPrivilegeTicketListRequest request) {
    return ticketService.privilegeTicketList(request);
  }

  /**
   * 门票详情接口.
   *
   * @param productId 门票产品ID
   * @return 门票详情
   */
  @GetMapping(value = "/detail")
  public CommonResponse<TicketDetailResponse> detail(
      @RequestParam Integer productId) {
    TicketDetailRequest request = new TicketDetailRequest(productId);
    return ticketService.detail(request);
  }

  /**
   * 门票详情接口.
   *
   * @param request TicketDetailRequest
   * @return 门票详情
   */
  @PostMapping(value = "/detail")
  public CommonResponse<TicketDetailResponse> detail(
      @RequestBody TicketDetailRequest request) {
    return ticketService.detail(request);
  }

  /**
   * 创建订单接口.
   *
   * @param request TicketCreateOrderNewRequest
   * @return 创建订单
   */
  @PostMapping(value = "/order/create/new")
  public CommonResponse<TicketCreateOrderNewResponse> createOrderNew(
      @RequestBody TicketCreateOrderNewRequest request) {
    return ticketService.createOrderNew(request);
  }

  /**
   * 取消订单接口.
   *
   * @param orderId 订单ID
   * @param remark  取消原因
   * @return 取消订单
   */
  @GetMapping(value = "/order/cancel")
  public String cancelOrder(@RequestParam Integer orderId, @RequestParam String remark) {
    TicketCancelOrderRequest request = new TicketCancelOrderRequest(orderId, remark);
    return ticketService.cancelOrder(request);
  }

  /**
   * 取消订单接口.
   *
   * @param request TicketCancelOrderRequest
   * @return 取消订单
   */
  @PostMapping(value = "/order/cancel")
  public String cancelOrder(@RequestBody TicketCancelOrderRequest request) {
    return ticketService.cancelOrder(request);
  }

  /**
   * 出票(代扣)接口.
   *
   * @param orderId  订单ID
   * @param payType  支付方式.1:途牛钱包代扣 3.企业支付宝代扣
   * @param pay      付款金额。只支持整数
   * @param platform 平台标识（10001:PC,20000:m站，30001:app安卓，30002:appIOS，30003:appWindows,30004
   *                 :app未知其他系统）（默认是pc）
   * @return 出票(代扣)
   */
  @GetMapping(value = "/order/submit")
  public CommonResponse<TicketSubmitOrderResponse> submitOrder(
      @RequestParam Integer orderId, @RequestParam Integer payType,
      @RequestParam String pay, @RequestParam String platform) {
    TicketSubmitOrderRequest request = new TicketSubmitOrderRequest("", orderId, payType,
        pay, platform);
    return ticketService.submitOrder(request);
  }

  /**
   * 出票(代扣)接口.
   *
   * @param request TicketSubmitOrderRequest
   * @return 出票(代扣)
   */
  @PostMapping(value = "/order/submit")
  public CommonResponse<TicketSubmitOrderResponse> submitOrder(
      @RequestBody TicketSubmitOrderRequest request) {
    return ticketService.submitOrder(request);
  }

  /**
   * 订单详情接口.
   *
   * @param orderId 订单ID
   * @return 订单详情
   */
  @GetMapping(value = "/order/detail")
  public CommonResponse<TicketOrderDetailResponse> orderDetail(
      @RequestParam Integer orderId) {
    TicketOrderDetailRequest request = new TicketOrderDetailRequest(orderId, "");
    return ticketService.orderDetail(request);
  }

  /**
   * 订单详情接口.
   *
   * @param request TicketOrderDetailRequest
   * @return 订单详情
   */
  @PostMapping(value = "/order/detail")
  public CommonResponse<TicketOrderDetailResponse> orderDetail(
      @RequestBody TicketOrderDetailRequest request) {
    return ticketService.orderDetail(request);
  }

  /**
   * 订单状态接口.
   *
   * @param orderId 订单ID
   * @return 订单状态
   */
  @GetMapping(value = "/order/status")
  public CommonResponse<TicketOrderStatusResponse> orderStatus(
      @RequestParam Integer orderId) {
    TicketOrderStatusRequest request = new TicketOrderStatusRequest(orderId, "");
    return ticketService.orderStatus(request);
  }

  /**
   * 订单状态接口.
   *
   * @param request TicketOrderStatusRequest
   * @return 订单状态
   */
  @PostMapping(value = "/order/status")
  public CommonResponse<TicketOrderStatusResponse> orderStatus(
      @RequestBody TicketOrderStatusRequest request) {
    return ticketService.orderStatus(request);
  }

  /**
   * 核销查询接口.
   *
   * @param orderId 订单ID
   * @return 核销查询
   */
  @GetMapping(value = "/order/verify")
  public CommonResponse<TicketVerifyOrderResponse> verifyOrder(
      @RequestParam Integer orderId) {
    TicketVerifyOrderRequest request = new TicketVerifyOrderRequest(orderId);
    return ticketService.verifyOrder(request);
  }

  /**
   * 核销查询接口.
   *
   * @param request TicketVerifyOrderRequest
   * @return 核销查询
   */
  @PostMapping(value = "/order/verify")
  public CommonResponse<TicketVerifyOrderResponse> verifyOrder(
      @RequestBody TicketVerifyOrderRequest request) {
    return ticketService.verifyOrder(request);
  }

  /**
   * 核损接口.
   *
   * @param orderId 订单ID
   * @return 核损
   */
  @GetMapping(value = "/can/refund")
  public CommonResponse<TicketCanRefundResponse> canRefund(
      @RequestParam Integer orderId) {
    TicketCanRefundRequest request = new TicketCanRefundRequest(orderId);
    return ticketService.canRefund(request);
  }

  /**
   * 核损接口.
   *
   * @param request TicketCanRefundRequest
   * @return 核损
   */
  @PostMapping(value = "/can/refund")
  public CommonResponse<TicketCanRefundResponse> canRefund(
      @RequestBody TicketCanRefundRequest request) {
    return ticketService.canRefund(request);
  }

  /**
   * 退票申请接口.
   *
   * @param orderId      订单ID
   * @param causeType    退订类型
   * @param causeContent 退订原因
   * @return 退票申请
   */
  @GetMapping(value = "/refund")
  public CommonResponse<TicketTuiPiaoResponse> tuiPiao(
      @RequestParam Integer orderId, @RequestParam Integer causeType,
      @RequestParam String causeContent) {
    TicketTuiPiaoRequest request = new TicketTuiPiaoRequest(orderId, causeType, causeContent);
    return ticketService.tuiPiao(request);
  }

  /**
   * 退票申请接口.
   *
   * @param request TicketTuiPiaoRequest
   * @return 退票申请
   */
  @PostMapping(value = "/refund")
  public CommonResponse<TicketTuiPiaoResponse> tuiPiao(
      @RequestBody TicketTuiPiaoRequest request) {
    return ticketService.tuiPiao(request);
  }
}
