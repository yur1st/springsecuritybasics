package com.yurist.controller;

import com.yurist.model.Cards;
import com.yurist.model.Customer;
import com.yurist.repository.CardsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    private final CardsRepository cardsRepository;

    public CardsController(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer) {
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getId());
        if (cards != null) {
            return cards;
        } else {
            return null;
        }
    }
}
