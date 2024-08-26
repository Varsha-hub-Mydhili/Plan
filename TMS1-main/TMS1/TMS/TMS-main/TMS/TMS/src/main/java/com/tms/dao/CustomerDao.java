package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tms.modal.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
