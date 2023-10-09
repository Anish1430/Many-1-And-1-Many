package com.Anish.Mant_1And1Many.controller;

import com.Anish.Mant_1And1Many.model.Product;
import com.Anish.Mant_1And1Many.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product newProduct)
    {
        return productService.addProduct(newProduct);
    }

    @GetMapping("products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
}
