package com.daoblunt.dao;

import com.daoblunt.pojo.User;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 10:43
 */
public interface UserMapper {
    //添加用户
    public void addUser(User user);
    //根据用户名查询
    public User findByUserName(User user);
    //修改用户名和密码
    public void updateUserNameAndPassword(User user);
}
