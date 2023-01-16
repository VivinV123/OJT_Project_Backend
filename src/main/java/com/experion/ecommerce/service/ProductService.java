package com.experion.ecommerce.service;

import com.experion.ecommerce.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {

//
//    List<Product> findAllProduct(String category, String sortBy);
//
//    List<Product> getProductCategory(String category);
//
//    List<Product> getProductCategoryOrderAsc(String category);
//
//    List<Product> getProductCategoryOrderDesc(String category);
//
//    List<Product> findProductWithSorting(String field);
//
//    List<Product> findProductWithSortingDescend(String field);

    List<Product> listAllProducts(String category,String sort);
}
