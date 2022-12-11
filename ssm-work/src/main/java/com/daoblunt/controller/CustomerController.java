package com.daoblunt.controller;

import com.daoblunt.pojo.Customer;
import com.daoblunt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 16:56
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //查询当前用户所有客户
    @RequestMapping("/findAll")
    public ModelAndView findAll(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        List<Customer> customerList = customerService.findAll(userId);
        modelAndView.addObject("customerList",customerList);
        modelAndView.setViewName("customerList");
        return modelAndView;
    }

    //删除客户
    @RequestMapping("/deleteByCustomerId/{customerId}")
    public String deleteByCustomerId(@PathVariable("customerId") Integer customerId){
        customerService.deleteByCustomerId(customerId);
        return "redirect:/customer/findAll";
    }

    //修改客户信息
    @RequestMapping("/update")
    public String update(Customer customer){
        customerService.update(customer);
        return "redirect:/customer/findAll";
    }

    @RequestMapping("/beforeUpdate/{customerId}")
    public ModelAndView beforeUpdate(@PathVariable("customerId") Integer customerId){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("customerId",customerId);
        modelAndView.setViewName("updateCustomer");
        return modelAndView;
    }
}
