package com.dxc.service;

import com.dxc.model.Payment;
import java.util.List;
public interface PaymentService {

	public Payment addPayment(Payment payment); 
	public List<Payment> getAllPayments();
	
}

