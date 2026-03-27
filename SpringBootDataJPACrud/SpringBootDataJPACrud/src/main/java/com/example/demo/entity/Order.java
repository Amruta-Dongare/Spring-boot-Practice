package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name =  "ORDERS")
@NamedQuery(name="Order.fetchAllByDatePurchased",
        query= "SELECT o FROM Order o WHERE o.datePurchased = ?1")
@NamedNativeQuery(name="Order.getAll",
        query="SELECT * FROM ORDERS WHERE CUSTOMER_ID = ?",
        resultClass = Order.class )

public class Order {

    @Id
    private int orderId;

    private int customerId;

    private LocalDate datePurchased;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDatepurchesed() {
        return datePurchased;
    }

    public void setDatepurchesed(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
//No args constructor to create the object of the order class
    public Order() {
    }
//All Args constructor to save the all the order at time for save method
    public Order(int orderId, int customerId, LocalDate datepurchesed, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.datePurchased = datepurchesed;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", datePurchased=" + datePurchased +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
