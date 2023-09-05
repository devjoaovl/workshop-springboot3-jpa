package com.persiste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persiste.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
