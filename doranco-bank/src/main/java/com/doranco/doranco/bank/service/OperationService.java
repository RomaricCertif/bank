package com.doranco.doranco.bank.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doranco.doranco.bank.dto.OperationDTO;
import com.doranco.doranco.bank.exceptions.DorancoException;
import com.doranco.doranco.bank.model.Account;
import com.doranco.doranco.bank.model.Depot;
import com.doranco.doranco.bank.model.Operation;
import com.doranco.doranco.bank.repository.IAccountRepository;
import com.doranco.doranco.bank.repository.IOperationRepository;

@Service
@Transactional(rollbackFor = DorancoException.class)
public class OperationService {
	
	public static final String DEPOT="D";

	@Autowired
	IAccountRepository accountRepository;

	@Autowired
	IOperationRepository iOperationRepository;

	public OperationDTO operation(OperationDTO operation) throws DorancoException {
		if (operation.getOperationType().equalsIgnoreCase(OperationService.DEPOT)) {
			Optional<Account> optional = accountRepository.findById(operation.getAccountId());
			optional.get().setAmount(optional.get().getAmount().add(operation.getAmount()));
			//de la mécanique
			Depot depot=new Depot();
			depot.setOperationId(operation.getOperationId());
			depot.setCreateDate(new Date());
			depot.setAmount(operation.getAmount());
			//de la mécanique
			if (operation.getAmount().compareTo(new BigDecimal(1000000)) > 0) {
				throw new DorancoException("Le versement d'un montant est soumis à un contrôl préalable");
			}
			accountRepository.save(optional.get());
			iOperationRepository.save(depot);
		}
		

		return operation;
	}

}
