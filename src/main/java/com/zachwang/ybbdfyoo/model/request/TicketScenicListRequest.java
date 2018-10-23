package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketScenicListRequest extends RequestModel {
  private static final long serialVersionUID = -3124759007076317058L;
  @Getter
  @Setter
  private String key;
  @Getter
  @Setter
  private Integer page;
  @Getter
  @Setter
  private Integer pageSize;
}
