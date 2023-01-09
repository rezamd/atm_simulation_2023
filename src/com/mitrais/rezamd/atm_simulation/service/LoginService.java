package com.mitrais.rezamd.atm_simulation.service;

import com.mitrais.rezamd.atm_simulation.exception.NoDataFoundException;
import com.mitrais.rezamd.atm_simulation.exception.UnauthorizedException;
import com.mitrais.rezamd.atm_simulation.model.Account;
import com.mitrais.rezamd.atm_simulation.repository.AccountRepository;

public class LoginService {
	AccountRepository accountRepo;
	
	public LoginService(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	public Account authenticateUser(String inputedLoginAccountNumber, String currentinputedPin) throws UnauthorizedException {
		try {
			return accountRepo.findByIdAndPin(inputedLoginAccountNumber, currentinputedPin);
		} catch (NoDataFoundException e) {
			throw new UnauthorizedException();
		}
	}
	
	

}
