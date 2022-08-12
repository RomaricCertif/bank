package com.doranco.doranco.bank.dto;

import java.math.BigDecimal;
import java.util.Date;


public  class OperationDTO{

	private String operationId;
	

	private BigDecimal amount=new BigDecimal (0);
	

	private Date operationDate=new Date();
	
	private String accountId;
	
	private String operationType;
	
	
	public OperationDTO() {
	
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

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	
	
}
