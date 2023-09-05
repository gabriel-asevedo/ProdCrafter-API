package com.springproject.productcategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.productcategory.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}