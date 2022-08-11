package com.doranco.doranco.bank.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Operation;
import com.doranco.doranco.bank.model.Particulier;
import com.doranco.doranco.bank.service.AccountService;
import com.doranco.doranco.bank.service.CustomerService;
import com.doranco.doranco.bank.service.OperationService;

@RestController
@RequestMapping ("/api/v1/operation")
public class OperationAPI {
	
	@Autowired
	OperationService operationService;
	
	
	@PostMapping("/depot")
	public ResponseEntity<Operation> save (@RequestBody Operation operation) {
		operationService.depot(operation);
		return new ResponseEntity<Operation>(operation,HttpStatus.OK);
	}

}
