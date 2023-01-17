package com.experion.ecommerce.service;

import com.experion.ecommerce.dto.ProductPost;
import com.experion.ecommerce.dto.UserPost;
import com.experion.ecommerce.entity.Product;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.ParseException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {

    List<Product> listAllProducts(String category,String sort);

    ProductPost addProduct(ProductPost request);


}
