package com.doranco.doranco.bank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CUSTOMER_TYPE",discriminatorType = DiscriminatorType.STRING)
public  class Customer extends AbstractEntity implements Serializable{

	@Id
	@Column(name = "CUSTOMER_CD")
	private String customercd;
	

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "EMAIL")
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<Account> accounts=new ArrayList<>();
	
	public Customer() {
		
	}

	public String getCustomercd() {
		return customercd;
	}

	public void setCustomercd(String customercd) {
		this.customercd = customercd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
