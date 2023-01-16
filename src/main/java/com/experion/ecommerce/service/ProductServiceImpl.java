package com.experion.ecommerce.service;

import com.experion.ecommerce.dao.ProductDao;
import com.experion.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> listAllProducts(String category, String sort) {
        return productDao.listAllProducts(category,sort);
    }

}
