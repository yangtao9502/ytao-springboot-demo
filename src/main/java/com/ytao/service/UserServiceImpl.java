package com.ytao.service;

import com.ytao.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by YangTao on 2019/10/14 0014.
 */
@Service
public class UserServiceImpl implements UserService {

    public User getUser(Long id) {
        if (id < 0)
            throw new IllegalArgumentException("id cannot be less than 0");
        User user=new User();
        user.setId(id);
        user.setName("ytao");
        user.setAge(18);
        System.out.println("我是新的.class文件");
        return user;
    }

}
