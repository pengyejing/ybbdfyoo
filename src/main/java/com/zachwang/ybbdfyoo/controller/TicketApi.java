package com.zachwang.ybbdfyoo.controller;

import com.zachwang.ybbdfyoo.model.request.TicketCreateOrderNewRequest;
import com.zachwang.ybbdfyoo.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketApi {
  private static final Logger LOG = LoggerFactory.getLogger(TicketApi.class);
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
  @RequestMapping(value = "/scenic/list", method = RequestMethod.GET)
  public String scenicList(@RequestParam String key, @RequestParam Integer page,
                           @RequestParam Integer pageSize) {
    String responseStr = ticketService.scenicList(key, page, pageSize);
    LOG.info(responseStr);
    return responseStr;
  }

  /**
   * 景点详情查询接口.
   *
   * @param scenicId 景点ID
   * @return 景点详情
   */
  @RequestMapping(value = "/scenic/detail", method = RequestMethod.GET)
  public String scenicDetail(@RequestParam String scenicId) {
    String responseStr = ticketService.scenicDetail(scenicId);
    LOG.info(responseStr);
    return responseStr;
  }

  /**
   * 特权门票查询接口.
   *
   * @param page     第几页.页从1开始
   * @param pageSize 分页大小
   * @return 特权门票
   */
  @RequestMapping(value = "/privilege/ticket/list", method = RequestMethod.GET)
  public String privilegeTicketList(@RequestParam Integer page, @RequestParam Integer pageSize) {
    String responseStr = ticketService.privilegeTicketList(page, pageSize);
    LOG.info(responseStr);
    return responseStr;
  }

  /**
   * 门票详情接口.
   *
   * @param productId 门票产品ID
   * @return 门票详情
   */
  @RequestMapping(value = "/detail", method = RequestMethod.GET)
  public String detail(@RequestParam Integer productId) {
    String responseStr = ticketService.detail(productId);
    LOG.info(responseStr);
    return responseStr;
  }

  /**
   * 创建订单接口.
   *
   * @param request 创建订单请求
   * @return 创建订单响应
   */
  @RequestMapping(value = "/create/order/new", method = RequestMethod.POST)
  public String createOrderNew(@RequestBody TicketCreateOrderNewRequest request) {
    String responseStr = ticketService.createOrderNew(request);
    LOG.info(responseStr);
    return responseStr;
  }
}
