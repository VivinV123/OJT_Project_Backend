package com.experion.ecommerce.dto;

import lombok.Data;

@Data
public class ProductPost {

    private String productName;
    private Double productPrice;
    private String productImg;
    private String  productDesc;
    private String  productCategory;
    private String  productBrand;
}
