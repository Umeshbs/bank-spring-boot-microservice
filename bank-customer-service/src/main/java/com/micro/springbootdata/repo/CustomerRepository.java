package com.micro.springbootdata.repo;

import org.springframework.data.repository.CrudRepository;
import com.micro.springbootdata.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
