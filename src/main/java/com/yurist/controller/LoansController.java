package com.yurist.controller;

import com.yurist.model.Customer;
import com.yurist.model.Loans;
import com.yurist.repository.LoanRepository;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    private final LoanRepository loanRepository;

    public LoansController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @PostMapping("/myLoans")
    @PostAuthorize("hasRole('ROOT')")
    public List<Loans> getLoansDetails(@RequestBody Customer customer) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getId());
        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }
}
