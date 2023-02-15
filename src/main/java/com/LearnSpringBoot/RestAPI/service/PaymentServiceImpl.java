package com.LearnSpringBoot.RestAPI.service;

import com.LearnSpringBoot.RestAPI.exception.AppException;
import com.LearnSpringBoot.RestAPI.model.Payment;
import com.LearnSpringBoot.RestAPI.model.User;
import com.LearnSpringBoot.RestAPI.respository.PaymentRepository;
import com.LearnSpringBoot.RestAPI.respository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    UserRepository userRepository;
    @Transactional
    public void transferMoney(Payment payment){
        User accountTo =userRepository.getAccountForUpdate(payment.getUserTo().getId()).orElseThrow(()-> new AppException(404,"User not found"));
        User accountFrom =userRepository.getAccountForUpdate(payment.getUserForm().getId()).orElseThrow(()-> new AppException(404,"User not found"));
        if(accountFrom.getMoney().compareTo(payment.getAmount()) < 0) {
            throw new AppException(404,"Account with id:" + accountFrom.getId() + " does not have enough balance to transfer.");

        }
        accountFrom.setMoney(String.valueOf(BigDecimal.valueOf(Integer.parseInt(accountTo.getMoney())).subtract(BigDecimal.valueOf(Integer.parseInt(payment.getAmount())))));
        accountTo.setMoney(String.valueOf(BigDecimal.valueOf(Integer.parseInt(accountTo.getMoney())).add(BigDecimal.valueOf(Integer.parseInt(payment.getAmount())))));
    }
}
