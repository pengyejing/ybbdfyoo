package com.zachwang.ybbdfyoo.model.response;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class TicketCanRefundResponse extends ResponseModel {
  private static final long serialVersionUID = 2484933125587957988L;
  @Getter
  @Setter
  private BigDecimal refundMoney;
  @Getter
  @Setter
  private Integer canCancel;
}
