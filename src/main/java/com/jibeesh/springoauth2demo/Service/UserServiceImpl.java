package com.jibeesh.springoauth2demo.Service;

import com.jibeesh.springoauth2demo.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUser() {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setId(1000L);
        user1.setName("jibeesh");
        user1.setEmail("jibeesh@gmail.com");
        userList.add(user1);

        User user2 = new User();
        user2.setId(1001L);
        user2.setName("aparna");
        user2.setEmail("aparna@gmail.com");
        userList.add(user2);

        return userList;
    }
}
