package com.experion.ecommerce.dao;

import com.experion.ecommerce.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@CrossOrigin("*")
//@RepositoryRestResource(collectionResourceRel = "products", path="product")

public interface ProductDao {
//    List<Product> findAllByproductCategory(String category, Sort by);
//
//    @Query(value = "Select * from product ud where ud.product_category=?1",nativeQuery = true)
//    List<Product>  userProductCategory(String category);
//
//    @Query(value = "SELECT * FROM product ud where ud.product_category=?1 ORDER BY ud.product_price ASC ;",nativeQuery = true)
//    List<Product>  userProductCategoryOrderAsc(String category);
//
//    @Query(value = "SELECT * FROM product ud where ud.product_category=?1 ORDER BY ud.product_price DESC ;",nativeQuery = true)
//    List<Product>  userProductCategoryOrderDesc(String category);


    List<Product> listAllProducts(String category, String sort);
}
