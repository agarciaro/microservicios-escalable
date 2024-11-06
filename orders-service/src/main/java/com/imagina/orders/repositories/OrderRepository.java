package com.imagina.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagina.orders.model.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
