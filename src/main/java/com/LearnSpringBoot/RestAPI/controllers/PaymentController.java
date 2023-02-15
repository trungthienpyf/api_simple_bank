package com.LearnSpringBoot.RestAPI.controllers;

import com.LearnSpringBoot.RestAPI.model.Payment;
import com.LearnSpringBoot.RestAPI.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody Payment payment) {
        paymentService.transferMoney(payment);
    }
}
