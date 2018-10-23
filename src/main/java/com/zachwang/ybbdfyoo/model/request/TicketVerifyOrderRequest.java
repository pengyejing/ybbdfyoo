package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketVerifyOrderRequest extends RequestModel {
  private static final long serialVersionUID = 2851613000742835271L;
  @Getter
  @Setter
  private Integer orderId;
}
