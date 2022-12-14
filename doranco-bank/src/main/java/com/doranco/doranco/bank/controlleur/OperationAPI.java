package com.doranco.doranco.bank.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.doranco.bank.dto.OperationDTO;
import com.doranco.doranco.bank.exceptions.DorancoException;
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
	public ResponseEntity<OperationDTO> save (@RequestBody OperationDTO operation) throws DorancoException {
		operationService.operation(operation);
		return new ResponseEntity<OperationDTO>(operation,HttpStatus.OK);
	}

}
