package com.daoblunt.dao;

import com.daoblunt.pojo.Customer;

import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 10:44
 */
public interface CustomerMapper {
    //查询所有客户
    public List<Customer> findAll(Integer userId);
    //添加客户
    public void addCustomer(Customer customer);
    //根据customerId删除客户
    public void deleteByCustomerId(Integer customerId);
    //修改客户信息
    public void update(Customer customer);
}
