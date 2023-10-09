package com.Anish.Mant_1And1Many.repository;

import com.Anish.Mant_1And1Many.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
