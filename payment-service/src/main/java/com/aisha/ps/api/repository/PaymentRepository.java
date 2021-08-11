package com.aisha.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisha.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	Payment findByOrderid(int orderId);

}
