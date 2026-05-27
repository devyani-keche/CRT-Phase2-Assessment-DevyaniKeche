// Q7

package com.devyani.postassessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.devyani.postassessment.entity.Product;

public interface ProductRepositoryExample
        extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p " +
           "WHERE p.price < :price " +
           "AND p.category = :category")

    List<Product> findProducts(
            @Param("price") double price,

            @Param("category") String category);
}