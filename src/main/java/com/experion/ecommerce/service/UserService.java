package com.experion.ecommerce.service;

import com.experion.ecommerce.dto.UserPost;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.ParseException;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    UserPost getToken(UserPost request) throws ParseException;


}
