package fr.morgan.apiagenda.service;

import fr.morgan.apiagenda.entity.Role;
import fr.morgan.apiagenda.entity.User;
import fr.morgan.apiagenda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
       String encryptedPwd = passwordEncoder.encode(user.getPassword());
       user.setPassword(encryptedPwd);
       userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }
}
