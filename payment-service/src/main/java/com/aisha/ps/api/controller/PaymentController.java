package com.aisha.ps.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.ps.api.entity.Payment;
import com.aisha.ps.api.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	private PaymentService service;
	
	@PostMapping("/doPayment")
	public Payment doPayment( @RequestBody Payment payment) {
		return service.doPayment(payment);
	}
}
