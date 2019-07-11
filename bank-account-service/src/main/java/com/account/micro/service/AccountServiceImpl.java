package com.account.micro.service;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.account.micro.model.Account;
import com.account.micro.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	DataSource dataSource;

	@Override
	public List<Account> listAccounts() {
		List<Account> accountList = (List<Account>) accountRepository.findAll();
		return accountList;
	}

	@Override
	public Account getAccountByID(int accountID) {
		Optional<Account> account = accountRepository.findById(accountID);
		return account.get();
	}

	@Override
	public Account createAccount(Account account) {
		account = accountRepository.save(account);
		return account;
	}

}
