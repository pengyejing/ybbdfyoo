package com.zachwang.ybbdfyoo.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketSubmitOrderResponse extends ResponseModel {
  private static final long serialVersionUID = -4242449843696312123L;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private Integer outTradeNo;
}
