package com.aisha.ps.api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aisha.ps.api.entity.Payment;
import com.aisha.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
     private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		 payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
}
