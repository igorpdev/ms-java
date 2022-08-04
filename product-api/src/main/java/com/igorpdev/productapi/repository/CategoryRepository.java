package com.igorpdev.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorpdev.productapi.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}