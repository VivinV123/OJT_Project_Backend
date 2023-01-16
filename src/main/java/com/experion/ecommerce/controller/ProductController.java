package com.experion.ecommerce.controller;

import com.experion.ecommerce.entity.Product;
import com.experion.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/all")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    private List<Product> listAll(@RequestParam( required = false) String category, @RequestParam( required = false) String sort)

    {
        return productService.listAllProducts(category,sort);
    }

}
