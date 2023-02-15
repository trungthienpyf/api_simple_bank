package com.LearnSpringBoot.RestAPI.respository;

import com.LearnSpringBoot.RestAPI.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
