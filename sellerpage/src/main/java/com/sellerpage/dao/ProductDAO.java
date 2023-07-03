package com.sellerpage.dao;

import java.util.*;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sellerpage.model.Products;

@Repository
public interface ProductDAO extends JpaRepository<Products, Integer>{


	public List<Products> findByProductid(int productid);



}
