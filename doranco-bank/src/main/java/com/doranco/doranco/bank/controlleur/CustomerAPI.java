package com.doranco.doranco.bank.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.doranco.bank.model.Customer;
import com.doranco.doranco.bank.model.Particulier;
import com.doranco.doranco.bank.service.CustomerService;

@RestController
@RequestMapping ("/api/v1/customer")
public class CustomerAPI {
	
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/save")
	public String save (@RequestBody Particulier particulier) {
		particulier.setCustomercd("01");
		particulier.setLastName("okemba Ngatsono Romaric");
		System.out.println("Information du particulier "+particulier.getPhoneNumber());
		customerService.save(particulier);
		return "Bonjour";
	}
	
	@GetMapping ("/all")
	public ResponseEntity<List<Customer>> search (){
		return new ResponseEntity<List<Customer>> (customerService.searchAll(),HttpStatus.OK);
	}

}
