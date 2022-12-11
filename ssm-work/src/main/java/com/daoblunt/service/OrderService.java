package com.daoblunt.service;

import com.daoblunt.pojo.Order;

import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 17:29
 */
public interface OrderService {
    //查询所有订单
    public List<Order> findAll(Integer userId);
    //添加订单
    public void addOrder(Order order,Integer customerId,Integer userId);
    //根据orderId删除订单
    public void deleteByOrderId(Integer orderId);
    //修改订单
    public void update(Order order);
}
