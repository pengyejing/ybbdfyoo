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
public class PriceCalendar implements Serializable {
  private static final long serialVersionUID = -8814569116056433774L;
  @Getter
  @Setter
  private String salePrice;
  @Getter
  @Setter
  private String departDate;
}
