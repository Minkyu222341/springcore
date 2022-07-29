package com.sparta.springcore.product.repository;

import com.sparta.springcore.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }