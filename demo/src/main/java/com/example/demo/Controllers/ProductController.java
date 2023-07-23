package com.example.demo.Controllers;


import com.example.demo.Services.ProductService;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.addProduct(product);
        return "New product was added";
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
