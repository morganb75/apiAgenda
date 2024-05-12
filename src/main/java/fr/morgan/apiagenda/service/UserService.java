package fr.morgan.apiagenda.service;

import fr.morgan.apiagenda.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();
    void createUser(User user);
    void deleteUser(Long id);
    void deleteAllUsers();
    User getUser(Long id);
}
