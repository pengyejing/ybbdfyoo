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
public class Tourist implements Serializable {
  private static final long serialVersionUID = 5528022246800821208L;
  @Getter
  @Setter
  private String name;
  @Getter
  @Setter
  private Integer psptType;
  @Getter
  @Setter
  private String psptId;
  @Getter
  @Setter
  private String tel;
  @Getter
  @Setter
  private String email;
}
