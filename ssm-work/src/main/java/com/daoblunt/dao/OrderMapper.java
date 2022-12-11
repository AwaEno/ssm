package com.daoblunt.dao;

import com.daoblunt.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 10:47
 */
public interface OrderMapper {
    //查询所有订单
    public List<Order> findAll(Integer userId);
    //添加订单
    public void addOrder(@Param("order") Order order, @Param("customerId") Integer customerId,@Param("userId") Integer userId);
    //根据orderId删除订单
    public void deleteByOrderId(Integer orderId);
    //根据customer删除订单
    public void deleteByCustomerId(Integer customerId);
    //修改订单信息
    public void update(Order order);
}
