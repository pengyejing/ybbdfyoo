package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketPrivilegeTicketListRequest extends RequestModel {
  private static final long serialVersionUID = -5200001518585491681L;
  @Getter
  @Setter
  private Integer page;
  @Getter
  @Setter
  private Integer pageSize;
}
