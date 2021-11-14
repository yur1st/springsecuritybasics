package com.yurist.controller;

import com.yurist.model.Accounts;
import com.yurist.model.Customer;
import com.yurist.repository.AccountsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private AccountsRepository accountsRepository;

    public AccountController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        Accounts accounts = accountsRepository.findByCustomerId(customer.getId());
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }
}
