package com.firstproject.FirstProject.controller;

import com.firstproject.FirstProject.dto.UserDTO;
import com.firstproject.FirstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Hello World";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/putUser")
    public String putUser(){
        return "User Put";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Deleted";
    }

}
