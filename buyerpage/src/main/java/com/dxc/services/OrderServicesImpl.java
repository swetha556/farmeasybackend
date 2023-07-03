package com.dxc.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.DAO.OrdersDAO;
import com.dxc.exception.OrderException;
import com.dxc.model.Orders;
import com.dxc.model.Products;

@Service
public class OrderServicesImpl implements OrderServices {

	

	@Autowired
	   private OrdersDAO ordersDAO;
	
	@Override
	public Orders order(Orders order) throws OrderException {
		return ordersDAO.save(order);
	}
	
	@Override
	public List<Orders> getAllOrders() {
		List<Orders> ordersList = ordersDAO.findAll();
        if(ordersList.size()>0)
            return ordersList;
        else
            return null;

	}

	@Override
	public List<Orders> getAllOrdersByProductid(int productid) {
		return ordersDAO.findByProductid(productid);
	}
	

	

}
