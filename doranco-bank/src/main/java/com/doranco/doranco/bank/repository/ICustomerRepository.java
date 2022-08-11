package com.doranco.doranco.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.doranco.bank.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String>{

}
