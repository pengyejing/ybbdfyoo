package com.zachwang.ybbdfyoo.model.response;

import com.zachwang.ybbdfyoo.model.AdmissionVoucher;
import com.zachwang.ybbdfyoo.model.PriceCalendar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketDetailResponse extends ResponseModel {
  private static final long serialVersionUID = 8028995100303384256L;
  @Getter
  @Setter
  private Integer limitNumHigh;
  @Getter
  @Setter
  private Integer advanceHour;
  @Getter
  @Setter
  private String resourceId;
  @Getter
  @Setter
  private String smsMessage;
  @Getter
  @Setter
  private Integer scenicId;
  @Getter
  @Setter
  private Integer productLineDestId;
  @Getter
  @Setter
  private Integer isLoss;
  @Getter
  @Setter
  private Integer webPrice;
  @Getter
  @Setter
  private String productName;
  @Getter
  @Setter
  private Integer costType;
  @Getter
  @Setter
  private Integer advanceDay;
  @Getter
  @Setter
  private Integer invoiceType;
  @Getter
  @Setter
  private String info;
  @Getter
  @Setter
  private Integer productLineId;
  @Getter
  @Setter
  private Integer limitNumLow;
  @Getter
  @Setter
  private Integer productNewLineDestId;
  @Getter
  @Setter
  private Integer productId;
  @Getter
  @Setter
  private String drawAddress;
  @Getter
  @Setter
  private Integer salePrice;
  @Getter
  @Setter
  private Integer drawType;
  @Getter
  @Setter
  private Integer custInfoLimit;
  @Getter
  @Setter
  private String bookNotice;
  @Getter
  @Setter
  private String indate;
  @Getter
  @Setter
  private Integer subType;
  @Getter
  @Setter
  private String admissionVoucherDesc;
  @Getter
  @Setter
  private AdmissionVoucher admissionVoucher;
  @Getter
  @Setter
  private Integer costLoss;
  @Getter
  @Setter
  private PriceCalendar[] priceCalendar;
  @Getter
  @Setter
  private Integer status;
  @Getter
  @Setter
  private String certificateType;
}
