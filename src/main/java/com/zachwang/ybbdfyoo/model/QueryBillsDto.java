package com.zachwang.ybbdfyoo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QueryBillsDto implements Serializable {
  private static final long serialVersionUID = 1790156928329118520L;
  @Getter
  @Setter
  private String amount;
  @Getter
  @Setter
  private String bizOrderId;
  @Getter
  @Setter
  private String merFlowNo;
  @Getter
  @Setter
  private String outTradeNo;
  @Getter
  @Setter
  private Integer status;
  @Getter
  @Setter
  private Integer billType;
  @Getter
  @Setter
  private String billTypeDesc;
  @Getter
  @Setter
  private String time;
  @Getter
  @Setter
  private String productType;
  @Getter
  @Setter
  private String remark;
}
