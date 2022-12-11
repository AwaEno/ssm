package com.daoblunt.service.impl;

import com.daoblunt.dao.OrderMapper;
import com.daoblunt.pojo.Order;
import com.daoblunt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 17:30
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    //查询所有订单
    public List<Order> findAll(Integer userId) {
        List<Order> orderList = orderMapper.findAll(userId);
        return orderList;
    }

    //添加订单
    public void addOrder(Order order, Integer customerId,Integer userId) {
        orderMapper.addOrder(order,customerId,userId);
    }

    //根据orderId删除订单
    public void deleteByOrderId(Integer orderId) {
        orderMapper.deleteByOrderId(orderId);
    }

    //修改订单
    public void update(Order order) {
        orderMapper.update(order);
    }
}
