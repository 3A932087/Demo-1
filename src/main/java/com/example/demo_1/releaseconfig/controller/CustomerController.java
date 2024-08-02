package com.example.demo_1.releaseconfig.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    // github
    @GetMapping
    public String getAllCustomer(){
        return "getAllUsers";
    }
    @GetMapping("/{id}")
    public String getAllCustomer(@PathVariable Long id){
        return "getAllUsers id";
    }
    @PostMapping
    public String postCustomer(){
        return "postAllUsers";
    }
    @PutMapping
    public String putCustomer(){
        return "putCustomer";
    }
    @PatchMapping
    public String patchCustomer(){
        return "patchCustomer";
    }
    @DeleteMapping
    public String deleteCustomer(){
        return "deleteCustomer";
    }
}
