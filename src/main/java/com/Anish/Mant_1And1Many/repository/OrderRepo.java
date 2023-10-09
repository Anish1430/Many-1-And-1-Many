package com.Anish.Mant_1And1Many.repository;

import com.Anish.Mant_1And1Many.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
