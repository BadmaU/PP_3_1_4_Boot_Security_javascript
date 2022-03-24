package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User saveUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
    User getUserById(long id);
    User updateUser (User user);
    void updateUserById(long id, User user);

    @Override
    UserDetails loadUserByUsername(String username);
}
