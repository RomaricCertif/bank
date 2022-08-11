package com.doranco.doranco.bank.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_ACCOUNT")
public class Account  extends AbstractEntity implements Serializable {
	
	@Id
	@Column(name = "ACCOUNT_ID")
	private String accountId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ACCOUNT_DT")
	private  Date accountDate=new Date(); 
	
	@Column(name = "AMOUNT")
	private BigDecimal amount =new BigDecimal(0);
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_CD")
	private Customer customer;
	
	@OneToMany(mappedBy = "account")
	private List<Operation> operations;
	
	public Account() {
		
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
