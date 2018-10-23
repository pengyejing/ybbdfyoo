package com.zachwang.ybbdfyoo.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketOrderStatusResponse extends ResponseModel {
  private static final long serialVersionUID = 5691635397784167496L;
  @Getter
  @Setter
  private String orderStatus;
}
