package com.example.POC.repository;

import com.example.POC.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategory(String category);

    List<Product> findByName(String name);
}
