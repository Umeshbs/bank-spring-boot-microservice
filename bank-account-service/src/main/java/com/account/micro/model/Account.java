package com.account.micro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "accountID")
	private int accountID;
	
	@Column(name = "accountname")
	private String accountName;
	
	@Column(name = "accounttype")
	private String accountType;
	
	@Column(name = "amount")
	private double amount;

	public Account() {
	}

	public Account(int accountID, String accountName, String accountType, double amount) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.accountType = accountType;
		this.amount = amount;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
