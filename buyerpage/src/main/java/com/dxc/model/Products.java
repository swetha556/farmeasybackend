package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Products {
 
	public int productid;
	public String productname;
	public String pdescription;
	private String specification;
	private double buyingprice;
	
	public Products() {
		super();
	}

	public Products(int productid, String productname, String pdescription ,String specification,double buyingprice) {
		super();
		this.productid= productid;
		this.productname = productname;
		this.pdescription= pdescription;
		this.specification = specification;
		this.buyingprice =  buyingprice;
	}

	public int getProductId() {
		return productid;
	}

	public void setProductId(int productid) {
		this.productid= productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String pname) {
		this.productname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification= specification;
	}
	
	public double Buyingprice() {
		return buyingprice;
	}
	public void setBuyingprice(double buyingprice) {
		this.buyingprice = buyingprice;
	}
	
	@Override
	public String toString() {
		return "Products [productid=" +productid + ", productname=" + productname + ", pdescription=" + pdescription + ","
				+ " specification=" + specification + ", buyingprice=" + buyingprice + " ]";
	}
	
}
