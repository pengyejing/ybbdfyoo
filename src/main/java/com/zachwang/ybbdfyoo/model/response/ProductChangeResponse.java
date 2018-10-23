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
public class ProductChangeResponse implements Serializable {
  private static final long serialVersionUID = -6677829285979909557L;
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
