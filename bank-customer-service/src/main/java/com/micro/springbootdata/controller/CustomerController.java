package com.micro.springbootdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.springbootdata.model.Customer;
import com.micro.springbootdata.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired(required = true)
	CustomerService customerService;

	@GetMapping(value = "/hello")
	public String helloWorld() {
		return "Welcome to Customer module...";
	}

	@GetMapping(value = "/list")
	public List<Customer> customerList() {
		return customerService.listCustomer();
	}

	@GetMapping(value = "{id}")
	public Customer getCustomerByID(@PathVariable("id") int customerID) {
		return customerService.getCustomerByID(customerID);
	}

	@PostMapping(value = "/create", headers = "Accept=application/json")
	public Customer createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		return customer;
	}
}
