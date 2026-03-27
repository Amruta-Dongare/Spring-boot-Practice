package com.example.demo.runner;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderStatus;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class OrderRunner implements ApplicationRunner {

    @Autowired
    OrderService orderService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // call save(order)

        Order order = orderService.save(new Order(1, 10, LocalDate.of(2025, 9, 16), OrderStatus.PROCESSED));
        System.out.println("order persisted : " + order);

        Order order2 = orderService.save(new Order(2, 12, LocalDate.of(2025, 9, 15), OrderStatus.DELIVERED));
        System.out.println("order persisted : " + order2);

    }
}
