package com.tms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.dao.CustomerDao;
import com.tms.modal.Customer;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServices {
	@Autowired
	CustomerDao customerdao;
	
	public List<Customer> getCustomer(){
		List<Customer> clist=customerdao.findAll();
		return clist;
		
	}
	
	

}
