package com.zachwang.ybbdfyoo.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketCreateOrderNewResponse extends ResponseModel {
  private static final long serialVersionUID = -3327646313408482115L;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private Integer isNewFlag;
}
