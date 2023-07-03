package com.dxc.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Orders;
import java.util.List;


import com.dxc.model.Products;

@Repository
public interface OrdersDAO extends JpaRepository<Orders, Integer>{



	List<Orders> findByProductid(int productid);
	
}
