package com.Anish.Mant_1And1Many.service;

import com.Anish.Mant_1And1Many.model.Order;
import com.Anish.Mant_1And1Many.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public String addOrder(Order newOrder) {
         orderRepo.save(newOrder);
         return "Added a NewProduct";
    }
}
