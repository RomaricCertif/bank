package com.doranco.doranco.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.doranco.bank.dto.AccountDTO;
import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Customer;
import com.doranco.doranco.bank.model.Enterprise;
import com.doranco.doranco.bank.model.Particulier;
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
	
	public List<AccountDTO> searchAll (){
		List<AccountDTO> accountDTOs=new ArrayList<>();
		for (Account e:accountRepository.findAll()) {
			AccountDTO accountDTO=new AccountDTO();
			accountDTO.setAccountDate(e.getAccountDate());
			accountDTO.setAccountId(e.getAccountId());
			if (e.getCustomer() instanceof Particulier) {
				Particulier particulier=(Particulier) e.getCustomer();
				accountDTO.setCustomerName(particulier.getFirstName()+", "+particulier.getLastName());
			}else {
				if (e.getCustomer() instanceof Particulier) {
					Enterprise  enterprise=(Enterprise) e.getCustomer();
					accountDTO.setCustomerName(enterprise.getSocialReason());
				}
			}
			accountDTOs.add(accountDTO);
		
		}
		return accountDTOs;
	}

}
