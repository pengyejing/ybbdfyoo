package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.Scenic;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketScenicListResponse extends ResponseModel {
  private static final long serialVersionUID = 6618451313761913007L;
  @Getter
  @Setter
  private Integer totalCount;
  @Getter
  @Setter
  private Scenic[] rows;
}
