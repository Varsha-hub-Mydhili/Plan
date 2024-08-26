package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.modal.Customer;
import com.tms.services.CustomerServices;

@RestController
public class CustomerController {
	@Autowired
	CustomerServices customerservice;
	
	@GetMapping("/customer")
	public List<Customer> getCustomerDetails(){
		return customerservice.getCustomer();
	}

}
