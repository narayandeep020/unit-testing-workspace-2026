package com.business.modal;

public interface Product {

	long getId();
	
	String getName();
	
	ProductType getType();
	
	Amount getAmount();
}
