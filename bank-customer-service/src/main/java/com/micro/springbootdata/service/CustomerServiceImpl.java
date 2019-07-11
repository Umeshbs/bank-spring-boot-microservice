package com.micro.springbootdata.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.springbootdata.model.Customer;
import com.micro.springbootdata.repo.CustomerRepository;
 
@Service
public class CustomerServiceImpl implements CustomerService{
	
	List<Customer> custList = new ArrayList<>();

    @Autowired
    CustomerRepository customerRepository;

	public List<Customer> listCustomer() {
		 for (Customer customer : customerRepository.findAll()) {
	           custList.add(customer);
	        }
		 return custList;
	}

	public Customer getCustomerByID(int customerID) {
//			return customerRepository.findAllById(customerID)
		return null;
	}

	public void createCustomer(Customer customer) {
		  customer =  customerRepository.save(customer);
	}
	 
}
