package com.example.aoplogging.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {

    public String getProductName() {
        return "Product-Test";
    }

}
