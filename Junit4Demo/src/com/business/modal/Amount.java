package com.business.modal;

import java.math.BigDecimal;


public interface Amount {

	BigDecimal getValue();
	
	Currency getCurrency();
}
