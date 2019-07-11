package com.account.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.micro.model.Account;
import com.account.micro.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService service;
	
	@GetMapping("/hello")
	public String helloMethod() {
		return "Welcom to Account service.";
	}

	@GetMapping("/list")
	public List<Account> listAllAccounts(){
		return service.listAccounts();
	}
	
	@GetMapping("{id}")
	public Account getAccountByID(@PathVariable("id") int accountID) {
		return service.getAccountByID(accountID);
	}
	
	@PostMapping(value = "/create", headers = "Accept=application/json")
	public Account createAccount(@RequestBody Account account) {
		 account = service.createAccount(account);
		 return account;
	}
}
