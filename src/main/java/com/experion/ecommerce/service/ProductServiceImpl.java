package com.experion.ecommerce.service;

import com.experion.ecommerce.dao.ProductDao;
import com.experion.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

// public List<Product> findAllProduct(String category, String sortBy){
//     if((category == null)&&(sortBy == null))
//         return productDao.findAll();
//   else {
//         return productDao.findAllByproductCategory(category, Sort.by(sortBy));
//     }
//
// }
//
// public List<Product> getProductCategory(String status){
//        return productDao.userProductCategory(status);
//    }
//
//    public List<Product> getProductCategoryOrderAsc(String category){
//        return productDao.userProductCategoryOrderAsc(category);
//    }
//
//    public List<Product> getProductCategoryOrderDesc(String category){
//        return productDao.userProductCategoryOrderDesc(category);
//    }
//
// public List<Product> findProductWithSorting(String field){
//     return productDao.findAll(Sort.by(Sort.Direction.ASC, field));
// }
//    public List<Product> findProductWithSortingDescend(String field){
//        return productDao.findAll(Sort.by(Sort.Direction.DESC, field));
//
//    }

//    @Autowired
//    private ProductDao productDao;

    @Override
    public List<Product> listAllProducts(String category, String sort) {
        // TODO Auto-generated method stub
//        return ProductDao.listAllProducts(product);
        return productDao.listAllProducts(category,sort);
    }

}
