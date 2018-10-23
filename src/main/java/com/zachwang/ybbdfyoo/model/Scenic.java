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
public class Scenic implements Serializable {
  private static final long serialVersionUID = 7272072059310539443L;
  @Getter
  @Setter
  private String scenicId;
  @Getter
  @Setter
  private String scenicName;
  @Getter
  @Setter
  private String newPicUrl;
  @Getter
  @Setter
  private String address;
  @Getter
  @Setter
  private String bizTime;
  @Getter
  @Setter
  private String glocation;
  @Getter
  @Setter
  private String blocation;
  @Getter
  @Setter
  private Double salePrice;
  @Getter
  @Setter
  private Ticket[] ticketList;
  @Getter
  @Setter
  private Ticket[] disTickets;
  @Getter
  @Setter
  private String asdasd;
}
