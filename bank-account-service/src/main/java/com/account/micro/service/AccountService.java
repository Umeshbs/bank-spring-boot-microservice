package com.account.micro.service;

import java.util.List;

import com.account.micro.model.Account;

public interface AccountService {
	
	public List<Account> listAccounts();

	public Account getAccountByID(int accountID);

	public Account createAccount(Account account);
}
