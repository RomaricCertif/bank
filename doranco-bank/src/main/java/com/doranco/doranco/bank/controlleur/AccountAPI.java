package com.doranco.doranco.bank.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Particulier;
import com.doranco.doranco.bank.service.AccountService;
import com.doranco.doranco.bank.service.CustomerService;

@RestController
@RequestMapping ("/api/v1/account")
public class AccountAPI {
	
	@Autowired
	AccountService accountService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Account> save (@RequestBody Account account) {
		accountService.save(account);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}

}
