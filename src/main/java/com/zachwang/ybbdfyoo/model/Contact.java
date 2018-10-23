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
public class Contact implements Serializable {
  private static final long serialVersionUID = 3389984303101017313L;
  @Getter
  @Setter
  private String contactName;
  @Getter
  @Setter
  private String contactEmail;
  @Getter
  @Setter
  private String contactTel;
  @Getter
  @Setter
  private Integer psptType;
  @Getter
  @Setter
  private String psptId;
}
