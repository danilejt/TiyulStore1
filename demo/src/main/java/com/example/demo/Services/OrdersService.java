package com.example.demo.Services;
import com.example.demo.model.Orders;
import com.example.demo.repositories.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    public Orders
    saveOrder(Orders order) {
        return ordersRepository.save(order);
    }

    public List<Orders> getAllOrders(){
        return ordersRepository.findAll();
    };


}
