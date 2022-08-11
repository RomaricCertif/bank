package com.doranco.doranco.bank.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.doranco.bank.model.Customer;
import com.doranco.doranco.bank.model.Particulier;
import com.doranco.doranco.bank.repository.ICustomerRepository;

@Transactional
@Service
public class CustomerService {

	@Autowired
	ICustomerRepository customerRepository;
	
	
	
	public Customer save (Customer customer) {
		Optional<Customer> optional= customerRepository.findById(customer.getCustomercd());
		if (optional!=null && optional.isPresent()) {
			Particulier particulier=(Particulier) optional.get();
			particulier.setLastName(((Particulier)customer).getLastName());
			customerRepository.save(particulier);
		}else {
			customerRepository.save(customer);
		}
		
		return customer;
	}
}
