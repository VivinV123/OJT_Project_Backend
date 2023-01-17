package com.experion.ecommerce.dao;

import com.experion.ecommerce.entity.Product;
import com.experion.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "product", path="products")

public interface ProductDao extends JpaRepository<Product,Long> {

}
