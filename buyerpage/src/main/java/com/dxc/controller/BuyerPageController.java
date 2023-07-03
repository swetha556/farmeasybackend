package com.dxc.controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.exception.OrderException;

import com.dxc.model.Orders;
import com.dxc.model.Products;
import com.dxc.services.OrderServices;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/buy")
public class BuyerPageController {
	
	@GetMapping("/greet")
    public String welcome(){
        return "Buyer page is working";
    }
	
	@Autowired
	private OrderServices orderservice;
	
	@PostMapping("/orders")
	public ResponseEntity<?> orderplan(@RequestBody Orders orders) throws OrderException {
		return new ResponseEntity<>(orderservice.order(orders), HttpStatus.CREATED);
	}
	
	@GetMapping("/orders")
    public List<Orders> getOrders(){
        return orderservice.getAllOrders();
    }
	
	@GetMapping("/orders/{productid}")
	 public List<Orders> getOrderByProductid(@PathVariable int productid){
		 return orderservice.getAllOrdersByProductid(productid);
	 }

	
	@Autowired
	private RestTemplate restTemplate;	

	@SuppressWarnings("unchecked")
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/buyer/products")
	public List<Products> getAllProducts(){	
		List<Products> products = null;
		
		String url = "http://localhost:8999/sell/products";
		
		try {
			products =restTemplate.getForObject(url,List.class);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return products;	
		}

	@SuppressWarnings("unchecked")
	@GetMapping("/buyer/products/{productid}")
	 public List<Products> getProductById(@PathVariable int productid) {
		List<Products> products = null;
		
		String url = "http://localhost:8999/sell/products/"+productid;
		
		try {
			products=restTemplate.getForObject(url,List.class);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		   return products;
	}
	
	
}
