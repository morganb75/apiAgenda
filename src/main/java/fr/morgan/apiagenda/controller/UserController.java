package fr.morgan.apiagenda.controller;

import fr.morgan.apiagenda.entity.User;
import fr.morgan.apiagenda.service.UserService;
import jakarta.persistence.PostRemove;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
//@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody  User user){
        userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
       userService.createUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @DeleteMapping("/users")
    public void deleteAllUsers(){
        userService.deleteAllUsers();
    }
}
