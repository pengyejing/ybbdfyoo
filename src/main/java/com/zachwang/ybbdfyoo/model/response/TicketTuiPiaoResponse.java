package com.zachwang.ybbdfyoo.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketTuiPiaoResponse extends ResponseModel {
  private static final long serialVersionUID = -1697270612304424767L;
  @Getter
  @Setter
  private String msg;
  @Getter
  @Setter
  private Integer resultType;
}
