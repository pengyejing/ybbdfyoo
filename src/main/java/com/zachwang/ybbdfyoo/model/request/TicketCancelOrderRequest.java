package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketCancelOrderRequest extends RequestModel {
  private static final long serialVersionUID = -1649322888432725837L;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private String remark;
}
