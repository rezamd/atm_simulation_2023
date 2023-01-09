package com.mitrais.rezamd.atm_simulation.repository;

import com.mitrais.rezamd.atm_simulation.exception.NoDataFoundException;
import com.mitrais.rezamd.atm_simulation.model.Account;

public interface IBaseRepository<T, Y> {
	T findById(Y id) throws NoDataFoundException;

	Account update(Account account) throws NoDataFoundException;
}
