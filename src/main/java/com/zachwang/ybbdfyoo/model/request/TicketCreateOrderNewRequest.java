package com.zachwang.ybbdfyoo.model.request;

import com.zachwang.ybbdfyoo.model.Contact;
import com.zachwang.ybbdfyoo.model.Delivery;
import com.zachwang.ybbdfyoo.model.Tourist;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketCreateOrderNewRequest extends RequestModel {
  private static final long serialVersionUID = 975287978014527095L;
  @Getter
  @Setter
  private String sourceOrderId;
  @Getter
  @Setter
  private Integer acctId;
  @Getter
  @Setter
  private Integer productId;
  @Getter
  @Setter
  private String startTime;
  @Getter
  @Setter
  private Integer bookNumber;
  @Getter
  @Setter
  private Contact contact;
  @Getter
  @Setter
  private List<Tourist> touristList;
  @Getter
  @Setter
  private Delivery delivery;
  @Getter
  @Setter
  private Integer couponValue;
}
