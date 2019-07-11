package com.micro.springbootdata.service;

import java.util.List;


import com.micro.springbootdata.model.Customer;

public interface CustomerService {

	public List<Customer> listCustomer();
	public Customer getCustomerByID(int customerID);
	public void createCustomer(Customer customer);

}
