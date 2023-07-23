package com.example.demo.Controllers;

import com.example.demo.Services.UserService;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody Users user){
        userService.saveUser(user);
        return "New User was added";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

}
