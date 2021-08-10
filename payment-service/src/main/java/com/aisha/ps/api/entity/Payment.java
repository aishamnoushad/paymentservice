package com.aisha.ps.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int PaymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderid;
	private double amount;
//	public void setTransactionId(String transactionId) {
//		this.transactionId = transactionId;
//		
//	}
	@Override
	public String toString() {
		return "Payment [PaymentId=" + PaymentId + ", paymentStatus=" + paymentStatus + ", transactionId="
				+ transactionId + "]";
	}
//	public int getPaymentId() {
//		return PaymentId;
//	}
//	public void setPaymentId(int paymentId) {
//		PaymentId = paymentId;
//	}
//	public String getPaymentStatus() {
//		return paymentStatus;
//	}
//	public void setPaymentStatus(String paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}
//	public String getTransactionId() {
//		return transactionId;
//	}
	
}
