package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketCanRefundRequest extends RequestModel {
  private static final long serialVersionUID = 24366417787022780L;
  @Getter
  @Setter
  private Integer orderId;
}
