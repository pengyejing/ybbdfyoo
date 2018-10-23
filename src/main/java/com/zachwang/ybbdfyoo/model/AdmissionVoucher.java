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
public class AdmissionVoucher implements Serializable {
  private static final long serialVersionUID = 3220090700619322598L;
  @Getter
  @Setter
  private Integer admissionVoucherCode;
  @Getter
  @Setter
  private String admissionVoucherDesc;
  @Getter
  @Setter
  private String smsMessage;
}
