package com.example.aoplogging.service;

import com.example.aoplogging.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public String getProductName() {
        return productRepo.getProductName();
    }

}
