package com.sellerpage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="itemlist")
public class Products {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String productname;
	private String pdescription;
	private String specification;
	private double buyingprice;
	//private String brandName;
	
	//@Lob
   // @Column(columnDefinition = "MEDIUMLOB")
    //private String image;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int productid, String productname, String pdescription,String specification,double buyingprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.pdescription= pdescription;
		this.specification=specification;
		this.buyingprice = buyingprice;
		//this.image = image;
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
	
	public double getBuyingprice() {
		return buyingprice;
	}
	public void setBuyingprice(double buyingprice) {
		this.buyingprice =buyingprice ;
	}
	
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
	
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ",pdescription =" + pdescription + ", specification=" + specification+ ",buyingprice=" + buyingprice+"]";
	}
	
	
	
}