package com.experion.ecommerce.service;

import com.experion.ecommerce.dto.UserPost;
import com.experion.ecommerce.entity.User;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.ParseException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    JSONObject getToken(UserPost request) throws ParseException;


}
