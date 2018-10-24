package com.zachwang.ybbdfyoo.controller;

import com.zachwang.ybbdfyoo.model.request.PublicBillQueryRequest;
import com.zachwang.ybbdfyoo.model.response.CommonResponse;
import com.zachwang.ybbdfyoo.model.response.PublicBillQueryResponse;
import com.zachwang.ybbdfyoo.service.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicApi {
  @Autowired
  private PublicService publicService;

  /**
   * 查询代扣账单接口.
   *
   * @param request PublicBillQueryRequest
   * @return CommonResponse
   */
  @PostMapping(value = "/bill/query")
  public CommonResponse<PublicBillQueryResponse> billQuery(
      @RequestBody PublicBillQueryRequest request) {
    return publicService.billQuery(request);
  }
}
