package com.doranco.doranco.bank.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Customer;
import com.doranco.doranco.bank.repository.IAccountRepository;
import com.doranco.doranco.bank.repository.ICustomerRepository;

@Service
@Transactional
public class AccountService {
	
	@Autowired
	IAccountRepository accountRepository;
	
	@Autowired 
	ICustomerRepository customerRepository;
	
	
	public Account save (Account account) {
	  Optional<Customer> optional=	customerRepository.
			  findById(account.getCustomer().getCustomercd());
	  account.setCustomer(optional.get());
	  accountRepository.save(account);
	  return account;
	}

}
