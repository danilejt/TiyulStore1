package com.example.demo.Controllers;


import com.example.demo.Services.OrdersService;
import com.example.demo.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/save")
    public String add(@RequestBody Orders order){

        ordersService.saveOrder(order);
        return "New order is saved";
    }

    @GetMapping("/getAll")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }
}
