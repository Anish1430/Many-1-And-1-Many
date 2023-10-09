package com.Anish.Mant_1And1Many.controller;

import com.Anish.Mant_1And1Many.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
}
