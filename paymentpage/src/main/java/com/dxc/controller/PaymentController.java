package com.dxc.controller;

import com.dxc.model.Payment;
import com.dxc.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/pay")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping("/payment")
	public void createPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	
//		try {
//			service.addPayment(payment);
//		} catch (DuplicatePaymentIDException e) {
//			System.out.println("\nCannot add the payment\n");
//			System.out.println(e);
////			e.printStackTrace();
//		}
	}
	
	
	
	@GetMapping("/payment")
	public List<Payment> getPayments(){    
       return service.getAllPayments();
	}
	
	
	
	//public Payment getPayment(int id)  {
		
		//Optional<Payment> p = Optional.of(service.getPayment(id));
		
		//if(p.isPresent()) {
			//	return p.get();
		//} else {
			//System.out.println("Payment Doesn't Exist");
			//return null;
		//}
		
//		Payment payment = null;
//		try {
//			payment = service.getPayment(id);
//		} catch (PaymentDoesNotExistException e) {
//			System.out.println("\nCannot find the hotel\n");
//			System.out.println(e);
//			return null;
////			e.printStackTrace();
//		}
//		return payment;
	}




