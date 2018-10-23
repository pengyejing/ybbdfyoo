package com.zachwang.ybbdfyoo.model.request;

import com.zachwang.ybbdfyoo.model.ProductNoticeDto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductChangeRequest implements Serializable {
  private static final long serialVersionUID = -7759169729601584462L;
  @Getter
  @Setter
  private List<ProductNoticeDto> productIds;
}
