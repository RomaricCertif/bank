package com.doranco.doranco.bank.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		particulier.setLastName("okemba Romaric");
		System.out.println("Information du particulier "+particulier.getPhoneNumber());
		customerService.save(particulier);
		return "Bonjour";
	}

}
