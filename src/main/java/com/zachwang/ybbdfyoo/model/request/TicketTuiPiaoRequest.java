package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketTuiPiaoRequest extends RequestModel {
  private static final long serialVersionUID = -2178236152993772946L;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private Integer causeType;
  @Getter
  @Setter
  private String causeContent;
}
