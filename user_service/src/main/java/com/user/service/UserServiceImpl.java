package com.user.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
    // fake user List
    List<User> list = List.of(
            new User(1, "Sanket bagade", "9873643454"),
            new User(2, "Pratik bagade", "9873643473"),
            new User(3, "Manish bagade", "9873343454")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
