package com.zachwang.ybbdfyoo.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketVerifyOrderResponse extends ResponseModel {
  private static final long serialVersionUID = -3537027808994814697L;
  @Getter
  @Setter
  private Integer retryStatus;
  @Getter
  @Setter
  private Boolean supportVerify;
  @Getter
  @Setter
  private String verifyMsg;
  @Getter
  @Setter
  private Integer totalCount;
  @Getter
  @Setter
  private Integer usedCount;
}
