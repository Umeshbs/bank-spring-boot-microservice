package com.account.micro.repo;

import org.springframework.data.repository.CrudRepository;

import com.account.micro.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
