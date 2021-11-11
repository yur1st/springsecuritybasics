package com.yurist.config;

import com.yurist.model.Customer;
import com.yurist.model.SecurityCustomer;
import com.yurist.repository.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetails implements UserDetailsService {

    private final CustomerRepository customerRepository;

    public MyUserDetails(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customers = customerRepository.findByEmail(username);
        if (customers.size() == 0) {
            throw new UsernameNotFoundException("User details not found for the user: " + username);
        }
        return new SecurityCustomer(customers.get(0));
    }
}
