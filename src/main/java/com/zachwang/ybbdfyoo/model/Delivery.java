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
public class Delivery implements Serializable {
  private static final long serialVersionUID = 2007069633351993178L;
  @Getter
  @Setter
  private Integer deliveryType;
  @Getter
  @Setter
  private String receiverName;
  @Getter
  @Setter
  private String telNum;
  @Getter
  @Setter
  private String deliveryEndAddress;
  @Getter
  @Setter
  private String zipCode;
}
