package com.experion.ecommerce.service;

import com.experion.ecommerce.dao.ProductDao;
import com.experion.ecommerce.dto.ProductPost;
import com.experion.ecommerce.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductServiceImpl implements ProductService{
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> listAllProducts(String category, String sort) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
        Root<Product> root = criteriaQuery.from(Product.class);
        if(sort !=null && !sort.isEmpty()) {
            if(sort.equalsIgnoreCase("asc")){
                criteriaQuery.orderBy(criteriaBuilder.asc(root.get("productPrice")));
                logger.info("Product Sorted in Ascending Order");
            }
            if(sort.equalsIgnoreCase("desc")){
                criteriaQuery.orderBy(criteriaBuilder.desc(root.get("productPrice")));
                logger.info("Product Sorted in Descending Order");
            }

        }
        if(category != null) {
            List<Predicate> predicates = new ArrayList<Predicate>();
            if(category != null && !category.isEmpty())
            predicates.add(criteriaBuilder.equal(root.get("productCategory"),category));
            if(sort !=null && !sort.isEmpty()) {
                if(sort.equalsIgnoreCase("asc")){
                    criteriaQuery.orderBy(criteriaBuilder.asc(root.get("productPrice")));
                    logger.info("Product Sorted Based on "+category+" in Ascending Order");
                }
                if(sort.equalsIgnoreCase("desc")){
                    criteriaQuery.orderBy(criteriaBuilder.desc(root.get("productPrice")));
                    logger.info("Product Sorted Based on "+category+" in Descending Order");
                }
            }

            criteriaQuery.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
        }

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
    @Override
    public ProductPost addProduct(ProductPost request) {
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setProductImg(request.getProductImg());
        product.setProductPrice(request.getProductPrice());
        product.setProductBrand(request.getProductBrand());
        product.setProductCategory(request.getProductCategory());
        product.setProductDesc(request.getProductDesc());
        productDao.save(product);
        return request;
    }
}
