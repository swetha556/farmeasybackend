package com.dxc.repository;
import com.dxc.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	List<Payment> findAll();



}