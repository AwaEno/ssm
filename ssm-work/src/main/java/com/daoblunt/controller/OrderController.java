package com.daoblunt.controller;

import com.daoblunt.pojo.Customer;
import com.daoblunt.pojo.Order;
import com.daoblunt.service.CustomerService;
import com.daoblunt.service.OrderService;
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
 * @create: 2022-12-10 17:31
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;
    //查看所有订单
    @RequestMapping("/findAll")
    public ModelAndView findAll(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        List<Order> orderList = orderService.findAll(userId);
        modelAndView.addObject("orderList",orderList);
        modelAndView.setViewName("orderList");
        return modelAndView;
    }

    //添加用户和订单
    @RequestMapping("/addCustomerAndOrder")
    public String addCustomerAndOrder(Order order, Customer customer,HttpServletRequest request){

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        customerService.addCustomer(customer);
        orderService.addOrder(order,customer.getCustomerId(),userId);
        return "redirect:/order/findAll";
    }
    //为客户添加订单
    @RequestMapping("/addOrder")
    public String addOrder(Order order,Integer customerId,HttpServletRequest request){

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        orderService.addOrder(order,customerId,userId);
        return "redirect:/customer/findAll";
    }

    //获取要添加订单客户的customerId
    @RequestMapping("/getCustomerId/{customerId}")
    public ModelAndView getCustomerId(@PathVariable("customerId") Integer customerId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customerId",customerId);
        modelAndView.setViewName("addOrder");
        return modelAndView;
    }

    //根据orderId删除订单
    @RequestMapping("/deleteByOrderId/{orderId}")
    public String deleteByOrderId(@PathVariable("orderId") Integer orderId){
        orderService.deleteByOrderId(orderId);
        return "redirect:/order/findAll";
    }

    //修改订单信息
    @RequestMapping("/update")
    public String update(Order order){
        orderService.update(order);
        return "redirect:/order/findAll";
    }

    //获取orderId,转发到updateOrder.jsp
    @RequestMapping("/beforeUpdate/{orderId}")
    public ModelAndView beforeUpdate(@PathVariable("orderId") Integer orderId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orderId",orderId);
        modelAndView.setViewName("updateOrder");
        return modelAndView;
    }
}
