package com.example.demo.Services;

import com.example.demo.model.Users;
import com.example.demo.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UsersRepository usersRepository;


    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    };
}
