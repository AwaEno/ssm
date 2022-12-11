package com.daoblunt.service.impl;

import com.daoblunt.dao.UserMapper;
import com.daoblunt.pojo.User;
import com.daoblunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 14:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //添加用户
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    //判断登录是否成功
    public boolean findByUserName(User user) {
        User user1 = userMapper.findByUserName(user);
        if (user1==null){
            return false;
        }
        if (user.getPassword().equals(user1.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }

    //更新用户名和密码
    public void updateUserNameAndPassword(User user) {
        userMapper.updateUserNameAndPassword(user);
    }

    //根据用户名查出用户
    public User findByUserNameToUser(User user) {
        User user1 = userMapper.findByUserName(user);
        return user1;
    }

}
