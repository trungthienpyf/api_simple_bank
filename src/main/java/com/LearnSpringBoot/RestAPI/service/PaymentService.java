package com.LearnSpringBoot.RestAPI.service;

import com.LearnSpringBoot.RestAPI.model.Payment;


public interface PaymentService {
    void transferMoney(Payment payment);
}
