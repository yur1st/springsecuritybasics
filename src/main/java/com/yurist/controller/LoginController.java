package com.yurist.controller;

import com.yurist.model.Customer;
import com.yurist.repository.CustomerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class LoginController {

    private final CustomerRepository customerRepository;

    public LoginController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Principal user) {
        List<Customer> customers = customerRepository.findByEmail(user.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }

    }
}
