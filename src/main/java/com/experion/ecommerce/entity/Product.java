package com.experion.ecommerce.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private String productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private Double productPrice;

    @Column(name="product_img")
    private String productImg;

    @Column(name="product_desc")
    private String  productDesc;

    @Column(name="product_category")
    private String  productCategory;

    @Column(name="product_brand")
    private String  productBrand;
}
