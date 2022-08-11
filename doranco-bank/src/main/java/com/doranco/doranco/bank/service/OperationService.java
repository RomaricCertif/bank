package com.doranco.doranco.bank.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Customer;
import com.doranco.doranco.bank.model.Operation;
import com.doranco.doranco.bank.repository.IAccountRepository;
import com.doranco.doranco.bank.repository.ICustomerRepository;
import com.doranco.doranco.bank.repository.IOperationRepository;

@Service
@Transactional
public class OperationService {
	
	@Autowired
	IAccountRepository accountRepository;
	
	@Autowired 
	IOperationRepository iOperationRepository;
	
	
	public Operation depot (Operation operation) {
	  Optional<Account> optional=	accountRepository.
			  findById(operation.getAccount().getAccountId());
	  optional.get().setAmount(optional.get().getAmount().add(operation.getAmount()));
	  iOperationRepository.save(operation);
	  accountRepository.save(  optional.get());
	  return operation;
	}

}
