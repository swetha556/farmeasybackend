package com.sellerpage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int orderid;
	public int productid;
	public String productname;
	public String buyername;
	public long buyermobile;
	public String buyeraddress;
	public String paymentmode;
	
	
	public Orders() {
		super();
	}


	public Orders(int orderid, int productid, String productname, String buyername, long buyermobile, String buyeraddress,
			String paymentmode) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.productname = productname;
		this.buyername = buyername;
		this.buyermobile = buyermobile;
		this.buyeraddress = buyeraddress;
		this.paymentmode = paymentmode;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getProductId() {
		return productid;
	}


	public void setProducId(int productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getBuyername() {
		return buyername;
	}


	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}


	public long getBuyermobile() {
		return buyermobile;
	}


	public void setBuyermobile(long buyermobile) {
		this.buyermobile = buyermobile;
	}


	public String getBuyeraddress() {
		return buyeraddress;
	}


	public void setBuyeraddress(String buyeraddress) {
		this.buyeraddress = buyeraddress;
	}


	public String getPaymentmode() {
		return paymentmode;
	}


	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}


	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", productid=" + productid+ ", productname=" + productname + ", buyername="
				+ buyername + ", buyermobile=" + buyermobile + ", buyeraddress=" + buyeraddress + ", paymentmode="
				+ paymentmode + "]";
	}

	
	
}