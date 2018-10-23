package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.Contact;
import com.zachwang.ybbdfyoo.model.Delivery;
import com.zachwang.ybbdfyoo.model.EnterCertificate;
import com.zachwang.ybbdfyoo.model.Tourist;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketOrderDetailResponse extends ResponseModel {
  private static final long serialVersionUID = -5412644536992259461L;
  private Integer orderId;
  private String canPay;
  private String productId;
  private String scenicId;
  private String scenicName;
  private String orderStatus;
  private String orderTime;
  private String planDate;
  private Integer bookNumber;
  private Integer amoutPrice;
  private String pickUpType;
  private String pickUpAddress;
  private String externalOrderId;
  private Contact contact;
  private Tourist[] touristList;
  private EnterCertificate enterCertificate;
  private Delivery delivery;
}
