package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.OrderRequest;
import com.example.jpa.dto.OrderResponse;
import com.example.jpa.entity.Customer;
import com.example.jpa.repository.CustomerRespository;
import com.example.jpa.repository.ProductRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRespository custRepo;
	
	@Autowired
	private ProductRepository prodRepo;
	
	@PostMapping("/placeAnOrder")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		return custRepo.save(request.getCustomer());
	}
	
	@GetMapping("/findOrders")
	public List<Customer> findAllOrders()
	{
		return custRepo.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getInfo()
	{
		return custRepo.findJoinInfo();
	}
}