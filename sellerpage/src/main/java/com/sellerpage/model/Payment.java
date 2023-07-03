package com.sellerpage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pay")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int paymentId;                                      
	String productname;
	String paymentDate;
	double amount;
	String paymentStatus;
	String paymentMethod;
	
	public Payment() {
		super();
	}

	public Payment(int paymentId, String productname, String paymentDate, double amount, String paymentStatus,
			String paymentMethod) {
		super();
		this.paymentId = paymentId;
		this.productname = productname;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", productname=" + productname + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + ", paymentStatus=" + paymentStatus + ", paymentMethod=" + paymentMethod + "]";
	}
}

