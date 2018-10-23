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
public class Ticket implements Serializable {
  private static final long serialVersionUID = -2972266459978914384L;
  @Getter
  @Setter
  private Integer productId;
  @Getter
  @Setter
  private String productName;
  @Getter
  @Setter
  private String scenicId;
  @Getter
  @Setter
  private String scenicName;
  @Getter
  @Setter
  private String webPrice;
  @Getter
  @Setter
  private String salePrice;
}
