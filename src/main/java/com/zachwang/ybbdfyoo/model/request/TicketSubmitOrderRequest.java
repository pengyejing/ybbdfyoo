package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketSubmitOrderRequest extends RequestModel {
  private static final long serialVersionUID = 9189166497250200956L;
  @Getter
  @Setter
  private String acctId;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private Integer payType;
  @Getter
  @Setter
  private String pay;
  @Getter
  @Setter
  private String platform;
}
