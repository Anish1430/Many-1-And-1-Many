package com.Anish.Mant_1And1Many.service;

import com.Anish.Mant_1And1Many.model.Product;
import com.Anish.Mant_1And1Many.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String addProduct(Product newProduct) {
        productRepo.save(newProduct);
        return "added new product";
    }

    public List<Product> getAllProducts() {
        List<Product> ans = productRepo.findAll();
        return ans;
    }
}
