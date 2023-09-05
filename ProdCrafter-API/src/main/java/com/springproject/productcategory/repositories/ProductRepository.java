package com.springproject.productcategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springproject.productcategory.entities.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

}