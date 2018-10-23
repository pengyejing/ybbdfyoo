package com.zachwang.ybbdfyoo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PublicBillQueryRequest extends RequestModel {
  private static final long serialVersionUID = 582165899187229681L;
  @Getter
  @Setter
  private Integer acctId;
  @Getter
  @Setter
  private Integer accType;
  @Getter
  @Setter
  private Integer billType;
  @Getter
  @Setter
  private Integer status;
  @Getter
  @Setter
  private String beginTime;
  @Getter
  @Setter
  private String endTime;
  @Getter
  @Setter
  private Integer start;
  @Getter
  @Setter
  private Integer limit;
}
