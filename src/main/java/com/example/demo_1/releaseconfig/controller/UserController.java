package com.example.demo_1.releaseconfig.controller;

//import releaseconfig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
//    @Autowired
//    private UserService userService;

    @GetMapping
    //public List<User> getAllUsers() {
    //    return userService.getAllUsers();
    //}
    public String getAllUsers(){
        return "getAllUsers";
    }

    @GetMapping("/{id}")
//    public Optional<User> getUserById(@PathVariable Long id) {
//        return userService.getUserById(id);
//    }
    public String getUserById(@PathVariable Long id) {
        return "getAllUsers";
    }

    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//    public String createUser(@RequestBody User user) {
//        return "createUser";
//    }


    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }
    public String deleteUser(@PathVariable Long id) {
        return "deleteUser";
    }

    @PutMapping
    public String putUser(){
        return "putUser";
    }

    @PatchMapping
    public String patchUser(){
        return "patchUser";
    }
}
