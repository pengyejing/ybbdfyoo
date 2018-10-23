package com.zachwang.ybbdfyoo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Scenic implements Serializable {
  private static final long serialVersionUID = 7272072059310539443L;
  private String scenicId;
  private String scenicName;
  private String newPicUrl;
  private String address;
  private String bizTime;
  private String glocation;
  private String blocation;
  private Ticket[] disTickets;
}
