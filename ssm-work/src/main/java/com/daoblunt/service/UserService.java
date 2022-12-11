package com.daoblunt.service;

import com.daoblunt.pojo.User;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 14:08
 */
public interface UserService {
    //添加用户
    public void addUser(User user);
    //根据用户名查询
    public boolean findByUserName(User user);
    //修改用户名和密码
    public void updateUserNameAndPassword(User user);
    //根据用户名查出用户
    public User findByUserNameToUser(User user);
}
