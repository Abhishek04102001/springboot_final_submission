package com.inventorymanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventorymanagement.entity.Customer;
import com.inventorymanagement.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findOrderByCustomerId(Long id);
}