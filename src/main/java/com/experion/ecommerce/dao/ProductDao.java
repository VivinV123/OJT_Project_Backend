package com.experion.ecommerce.dao;

import com.experion.ecommerce.entity.Product;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "products", path="product")

public interface ProductDao extends JpaRepository<Product,String> {
}
