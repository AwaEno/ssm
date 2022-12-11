package com.daoblunt.pojo;

/**
 * @author: daoblunt
 * @description:
 * @create: 2022-12-10 10:38
 */
public class Order {
    private Integer orderId;
    private String sequence;
    private Integer price;
    private Customer customer;
    private User user;
    private Integer status;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", sequence='" + sequence + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                ", user=" + user +
                ", status=" + status +
                '}';
    }
}
