package com.experion.ecommerce.dao;


import com.experion.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "user", path="users")

public interface UserDao extends JpaRepository<User,Long> {

}

