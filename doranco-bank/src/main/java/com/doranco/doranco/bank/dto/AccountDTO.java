package com.doranco.doranco.bank.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDTO {


	private String accountId;
	
	private  Date accountDate=new Date(); 
	
	private BigDecimal amount =new BigDecimal(0);
	

	private String  customerName;
	
	public AccountDTO() {
		
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Date getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
