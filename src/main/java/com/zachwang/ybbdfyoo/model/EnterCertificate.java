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
public class EnterCertificate implements Serializable {
  private static final long serialVersionUID = 8450339398745169825L;
  @Getter
  @Setter
  private String enterCertificateType;
  @Getter
  @Setter
  private String enterCertificateTypeInfo;
  @Getter
  @Setter
  private String enterCertificateTxt;
}
