package com.business;

import java.util.List;

import com.business.exception.DifferentCurrenciesException;
import com.business.modal.Amount;
import com.business.modal.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
		throws DifferentCurrenciesException;

}
