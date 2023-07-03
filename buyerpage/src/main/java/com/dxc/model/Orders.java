package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderslist")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int orderid;
	int productid;
	String productname;
	String firstName;
	String lastName;
	long mobileNumber;
	long alternateMobileNumber;
	String shippingAddress;
	
	
	public Orders() {
		super();
	}


	public Orders(int orderid, int productid, String productname, String firstName, String lastName, long mobileNumber,
			long alternateMobileNumber, String shippingAddress) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.productname = productname;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.alternateMobileNumber = alternateMobileNumber;
		this.shippingAddress = shippingAddress;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public long getAlternateMobileNumber() {
		return alternateMobileNumber;
	}


	public void setAlternateMobileNumber(long alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}


	public String getShippingAddress() {
		return shippingAddress;
	}


	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", productid=" + productid + ", productname=" + productname
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", alternateMobileNumber=" + alternateMobileNumber + ", shippingAddress=" + shippingAddress + "]";
	}
	
	
}
