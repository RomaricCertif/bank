package com.doranco.doranco.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doranco.doranco.bank.exceptions.DorancoException;
import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Operation;
import com.doranco.doranco.bank.repository.IAccountRepository;
import com.doranco.doranco.bank.repository.IOperationRepository;

@Service
@Transactional(rollbackFor = DorancoException.class)
public class OperationService {

	@Autowired
	IAccountRepository accountRepository;

	@Autowired
	IOperationRepository iOperationRepository;

	public Operation depot(Operation operation) throws DorancoException {
		Optional<Account> optional = accountRepository.findById(operation.getAccount().getAccountId());
		optional.get().setAmount(optional.get().getAmount().add(operation.getAmount()));
		accountRepository.save(optional.get());
		if (operation.getAmount().compareTo(new BigDecimal(1000000)) > 0) {
			throw new DorancoException("Le versement d'un montant est soumis à un contrôl préalable");
		}
		iOperationRepository.save(operation);

		return operation;
	}

}
