package com.sellerpage.service;


import java.util.List;



import com.sellerpage.exception.ProductExistsException;
import com.sellerpage.model.Products;

public interface IProductService {
//	public void saveProductToDB(MultipartFile file, String productname, String pdescription,String specification,
//            Double buyingprice) throws ProductExistsException;
	public List<Products> getAllProducts();
	public Products createProducts(Products products) throws ProductExistsException ;
	public void deleteProduct(int productid);
	public void updateProduct(int productid, Products products);
	public List<Products> getProductById(int productid);
	

;


	
}