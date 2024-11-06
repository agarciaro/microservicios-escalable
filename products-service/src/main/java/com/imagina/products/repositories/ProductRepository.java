package com.imagina.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagina.products.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
