package com.project.megusta.service;

import java.util.Optional;

import com.project.megusta.business.Customer;

import org.springframework.security.core.userdetails.User;

public interface CustomerService {
    String login(String username, String password);

    Optional<User> findByToken(String token);

    Customer findById(Long id);
}
