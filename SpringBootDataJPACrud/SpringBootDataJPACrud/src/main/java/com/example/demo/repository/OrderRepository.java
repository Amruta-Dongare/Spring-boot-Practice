package com.example.demo.repository;

import com.example.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;


@Repository //optional
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerId(int customerId);

    @Query(value = "SELECT o.orderId, o.orderStatus FROM Order o")
    List<Object[]> fetchAllOrders();

    @Query(value = "SELECT * FROM ORDERS WHERE ORDER_STATUS = ?", nativeQuery = true)
    List<Order> fetchOrdersByStatus(String status);

    List<Order>  fetchAllByDatePurchased(LocalDate datePurchased);

    List<Order>  getAll(int customerId);

  //  List<Order> fetchOrderByStatus(String status);
}
