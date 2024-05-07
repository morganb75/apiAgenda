package fr.morgan.apiagenda.controller;

import fr.morgan.apiagenda.entity.User;
import fr.morgan.apiagenda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
       userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
