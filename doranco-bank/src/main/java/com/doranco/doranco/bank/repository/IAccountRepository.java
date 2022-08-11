package com.doranco.doranco.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.doranco.bank.model.Account;

@Repository
public interface IAccountRepository  extends JpaRepository<Account, String>{

}
