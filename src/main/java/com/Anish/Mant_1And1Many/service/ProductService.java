package com.Anish.Mant_1And1Many.service;

import com.Anish.Mant_1And1Many.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
}
