package com.experion.ecommerce.controller;

import com.experion.ecommerce.entity.Product;
import com.experion.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/all")
public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping("/product")
//    public List<Product> getProduct(
//            @RequestParam(value = "productCategory", required = false) String category,
//            @RequestParam(value = "sortBy",required = false) String sortBy)
//          {
//      return productService.findAllProduct(category,sortBy);
//    }

//    @Autowired
//    private ProductService productService;


    @GetMapping("/listAll")
    private List<Product> listAll(@RequestParam( required = false) String category, @RequestParam( required = false) String sort)

    {
        return productService.listAllProducts(category,sort);
    }

}
