// Q17

package com.devyani.postassessment.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.devyani.postassessment.entity.Product;

import com.devyani.postassessment.repository.ProductRepositoryExample;

@Service
public class ProductService {

    @Autowired
    private ProductRepositoryExample repo;

    public Product getById(Long id) {

        return repo.findById(id)
                .orElseThrow();
    }
}