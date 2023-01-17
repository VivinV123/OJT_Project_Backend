package com.experion.ecommerce.controller;

import com.experion.ecommerce.dao.UserDao;
import com.experion.ecommerce.dto.UserPost;
import com.experion.ecommerce.entity.User;
import com.experion.ecommerce.service.UserService;
import net.minidev.json.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
@Autowired
    UserDao userDao;

    @PostMapping("/user_token")
    public UserPost getToken(@RequestBody UserPost request) throws ParseException {
        logger.info("User Token Generated");
        return userService.getToken(request);
    }
    @GetMapping("all")
    public List<User> displayall(){
        logger.info("User Trying to Login");
        return userDao.findAll();

    }


}
