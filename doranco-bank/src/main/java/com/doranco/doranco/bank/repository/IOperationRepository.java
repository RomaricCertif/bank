package com.doranco.doranco.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Operation;

@Repository
public interface IOperationRepository  extends JpaRepository<Operation, String>{

}
