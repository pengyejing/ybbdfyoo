package com.zachwang.ybbdfyoo.model.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderChangeRequest implements Serializable {
  private static final long serialVersionUID = 1944325536547953418L;
  @Getter
  @Setter
  private Integer orderId;
}
