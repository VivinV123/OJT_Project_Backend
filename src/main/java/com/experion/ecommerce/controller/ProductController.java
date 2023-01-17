package com.experion.ecommerce.controller;

import com.experion.ecommerce.dto.ProductPost;
import com.experion.ecommerce.entity.Product;
import com.experion.ecommerce.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    private List<Product> listAll(@RequestParam( required = false) String category, @RequestParam( required = false) String sort)

    {
        return productService.listAllProducts(category,sort);
    }
    @PostMapping("/add")
    public ProductPost addProduct(@RequestBody ProductPost request) {
        logger.info("Product Added Successfully");
        return productService.addProduct(request);
    }

}
