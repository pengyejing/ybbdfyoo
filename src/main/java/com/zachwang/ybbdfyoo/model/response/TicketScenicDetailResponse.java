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
public class TicketScenicDetailResponse extends ResponseModel {
  private static final long serialVersionUID = 9021513649244642730L;
  @Getter
  @Setter
  private String scenicId;
  @Getter
  @Setter
  private String scenicName;
  @Getter
  @Setter
  private String bookNotice;
  @Getter
  @Setter
  private String cityName;
  @Getter
  @Setter
  private String provinceName;
  @Getter
  @Setter
  private String glocation;
  @Getter
  @Setter
  private String blocation;
  @Getter
  @Setter
  private String openTime;
  @Getter
  @Setter
  private String scenicAddress;
  @Getter
  @Setter
  private String defaultPic;
  @Getter
  @Setter
  private String scenicDescription;
  @Getter
  @Setter
  private String recommend;
  @Getter
  @Setter
  private String trafficBus;
  @Getter
  @Setter
  private Ticket[] disTickets;
}
