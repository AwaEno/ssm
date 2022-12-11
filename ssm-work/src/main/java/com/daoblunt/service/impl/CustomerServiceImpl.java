package com.daoblunt.service.impl;

import com.daoblunt.dao.CustomerMapper;
import com.daoblunt.dao.OrderMapper;
import com.daoblunt.pojo.Customer;
import com.daoblunt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 16:54
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderMapper orderMapper;

    //查询所有客户
    public List<Customer> findAll(Integer userId) {
        List<Customer> customerList = customerMapper.findAll(userId);
        return customerList;
    }

    //添加用户
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
    }

    //根据customerId删除客户
    public void deleteByCustomerId(Integer customerId) {
        orderMapper.deleteByCustomerId(customerId);
        customerMapper.deleteByCustomerId(customerId);
    }

    //修改用户信息
    public void update(Customer customer) {
        customerMapper.update(customer);
    }

}
