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
public class OrderInfo implements Serializable {
  private static final long serialVersionUID = -4320506724021052502L;
  @Getter
  @Setter
  private String canPay;
  @Getter
  @Setter
  private String scenicName;
  @Getter
  @Setter
  private String productId;
  @Getter
  @Setter
  private Integer orderId;
  @Getter
  @Setter
  private String scenicId;
  @Getter
  @Setter
  private Double amoutPrice;
  @Getter
  @Setter
  private String pickUpAddress;
  @Getter
  @Setter
  private String orderStatus;
  @Getter
  @Setter
  private String externalOrderId;
  @Getter
  @Setter
  private String planDate;
  @Getter
  @Setter
  private String orderTime;
  @Getter
  @Setter
  private String pickUpType;
  @Getter
  @Setter
  private Integer bookNumber;
  @Getter
  @Setter
  private EnterCertificate enterCertificate;
  @Getter
  @Setter
  private Contact contact;
  @Getter
  @Setter
  private Tourist[] touristList;
  @Getter
  @Setter
  private Delivery delivery;
}
