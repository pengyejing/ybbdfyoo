package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketDetailRequest extends RequestModel {
  private static final long serialVersionUID = -7249734068125326922L;
  @Getter
  @Setter
  private Integer productId;
}
