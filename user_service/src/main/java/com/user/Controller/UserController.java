package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long UserId){

        

        User user = this.userService.getUser(UserId);
        // http://localhost:9002/contact/user/16645

        // List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserId(), List.class);
        List contacts = this.restTemplate.getForObject("http://contact_service/contact/user/" + user.getUserId(), List.class);


        user.setContacts(contacts);
        return user;


    }
}
