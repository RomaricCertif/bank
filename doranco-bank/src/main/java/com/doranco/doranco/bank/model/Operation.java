package com.doranco.doranco.bank.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public  class Operation extends AbstractEntity implements Serializable{

	@Id
	@Column(name = "OPERATION_ID")
	private String operationId;
	
	@Column(name = "AMOUNT")
	private BigDecimal amount=new BigDecimal (0);
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OPERATION_DT")
	private Date operationDate=new Date();
	
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account=new Account();

	
	public Operation() {
	
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
