package com.daoblunt.controller;

import com.daoblunt.pojo.User;
import com.daoblunt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 14:20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //存储当前用户
    private User userOne;

    //登录
    @RequestMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        boolean isSuccess = userService.findByUserName(user);
        if (isSuccess){
            modelAndView.setViewName("home");
            userOne = userService.findByUserNameToUser(user);//查询出当前用户的全部信息，并用userOne存储
            HttpSession session = request.getSession();
            Integer userId = userOne.getUserId();//将userId放到session中，实现不同用户拥有不同的数据
            session.setAttribute("userId",userId);
        }else {
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    //注册
    @RequestMapping("/registered")
    public ModelAndView registered(User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        userService.addUser(user);
        System.out.println(user.getUserId());
        return modelAndView;
    }

    //修改用户名和密码
    @RequestMapping("/update")
    public String update(User user){
        userService.updateUserNameAndPassword(user);
        return "home";
    }

    @RequestMapping("/beforeUpdate")
    public ModelAndView beforeUpdate(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateNameAndPassword");
        modelAndView.addObject("user",userOne);
        return modelAndView;
    }
}
