package com.dxc.services;

import java.util.List;


import com.dxc.exception.OrderException;
import com.dxc.model.Orders;

public interface OrderServices {
	Orders order(Orders order) throws OrderException;

	List<Orders> getAllOrders();

	List<Orders> getAllOrdersByProductid(int productid);

	
	
}
