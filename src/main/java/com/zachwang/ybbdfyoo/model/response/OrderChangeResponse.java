package com.zachwang.ybbdfyoo.model.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderChangeResponse implements Serializable {
  private static final long serialVersionUID = -2389613746772019695L;
  @Getter
  @Setter
  private Boolean success;
  @Getter
  @Setter
  private String msg;
  @Getter
  @Setter
  private Integer errorCode;
}
