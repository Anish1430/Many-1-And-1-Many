package com.Anish.Mant_1And1Many.controller;

import com.Anish.Mant_1And1Many.model.Order;
import com.Anish.Mant_1And1Many.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("orders")
    public String addOrder(@RequestBody Order newOrder) {
        return orderService.addOrder(newOrder);
    }
    @GetMapping("orders")

    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }
}
