package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketScenicDetailRequest extends RequestModel {
  private static final long serialVersionUID = -4385396073151227381L;
  @Getter
  @Setter
  private String scenicId;
}
