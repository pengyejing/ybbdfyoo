package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.QueryBillsDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PublicBillQueryResponse extends ResponseModel {
  private static final long serialVersionUID = 2133737119728101193L;
  @Getter
  @Setter
  private Integer count;
  @Getter
  @Setter
  private Integer pages;
  @Getter
  @Setter
  private List<QueryBillsDto> rows;
}
