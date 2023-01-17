package com.experion.ecommerce.service;

import com.experion.ecommerce.dao.UserDao;
import com.experion.ecommerce.dto.UserPost;
import com.experion.ecommerce.entity.User;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Base64;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
@Autowired
        private UserDao userDao;
        @Override
        public UserPost getToken(UserPost userPost) throws ParseException {
                String[] chunks = userPost.getUserToken().split("\\.");
                Base64.Decoder decoder = Base64.getUrlDecoder();
                String payloads = new String(decoder.decode(chunks[1]));
                JSONParser parser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
                JSONObject jsonResponse = (JSONObject) parser.parse(payloads);
                User user = new User();
                user.setUserId(user.getUserId());
                user.setUserName(jsonResponse.getAsString("name"));
                user.setUserEmail(jsonResponse.getAsString("email"));
                user.setUserPicture(jsonResponse.getAsString("picture"));
                userDao.save(user);
                return userPost;
        }

}




