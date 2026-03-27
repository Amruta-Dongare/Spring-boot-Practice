package com.example.demo.entity;

public enum OrderStatus {
    PROCESSED("processed"),
    CANCELLED("cancelled"),
    DELIVERED("delivered"),
    REFUNDED("refunded");

    private String value;
    private OrderStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
