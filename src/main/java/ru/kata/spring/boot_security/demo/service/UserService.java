package ru.kata.spring.boot_security.demo.service;

import org.springframework.web.bind.annotation.RequestParam;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    User findByUsername(String username);

    List<User> getAll();

    void add(User user);

    void delete(Long id);

    User getUserById(Long id);

    void update(Long id, String name, String surname,
                int age, String password, Set<Role> roles);
}
