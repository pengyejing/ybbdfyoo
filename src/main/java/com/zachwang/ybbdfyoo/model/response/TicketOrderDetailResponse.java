package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.OrderInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketOrderDetailResponse extends ResponseModel {
  private static final long serialVersionUID = -5412644536992259461L;
  @Getter
  @Setter
  private OrderInfo orderInfo;
  @Getter
  @Setter
  private String orderStatus;
}
