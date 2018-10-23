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
public class ProductNoticeDto implements Serializable {
  private static final long serialVersionUID = -8004565600513842273L;
  @Getter
  @Setter
  private Integer productId;
  @Getter
  @Setter
  private Integer noticeType;
  @Getter
  @Setter
  private Integer classBrandParentId;
}
