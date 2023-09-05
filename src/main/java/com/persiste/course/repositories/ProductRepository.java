package com.persiste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persiste.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
