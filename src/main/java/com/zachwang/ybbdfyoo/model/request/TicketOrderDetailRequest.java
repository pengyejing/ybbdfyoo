package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketOrderDetailRequest extends RequestModel {
  private static final long serialVersionUID = 8282413350042016899L;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private String acctId;
}
