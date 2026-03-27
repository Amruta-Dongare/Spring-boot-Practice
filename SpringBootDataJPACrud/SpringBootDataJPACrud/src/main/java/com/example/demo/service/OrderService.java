package com.example.demo.service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Order findById(int id) {
        return orderRepository.findById(id).get();
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public void deleteById(int id) {
        orderRepository.deleteById(id);
    }

    public List<Order> findByCustomerId(int customerId){
        return orderRepository.findByCustomerId(customerId);
    }

    public List<Object[]> fetchAllOrders(){
        return orderRepository.fetchAllOrders();
    }

    public List<Order> fetchOrdersByStatus(String status){
        return orderRepository.fetchOrdersByStatus(status);
    }


    public  List<Order> fetchAllByDatePurchased(LocalDate datePurchased){
        return orderRepository.fetchAllByDatePurchased(datePurchased);
    }

    public  List<Order> getAll(int customerId){
        return orderRepository.getAll(customerId);
    }
}
