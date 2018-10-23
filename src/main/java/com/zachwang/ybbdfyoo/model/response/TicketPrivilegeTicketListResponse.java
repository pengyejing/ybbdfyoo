package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketPrivilegeTicketListResponse extends ResponseModel {
  private static final long serialVersionUID = 1574010662078330421L;
  @Getter
  @Setter
  private Integer totalCount;
  @Getter
  @Setter
  private Ticket[] rows;
}
