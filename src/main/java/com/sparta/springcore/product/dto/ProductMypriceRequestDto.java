package com.sparta.springcore.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductMypriceRequestDto {
    private int myprice;
    private Long id;
}
