package com.udemy.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("carInsurance")
public class CarInsurance implements Insurance{
	@Autowired
	@Qualifier("OfferUS")
	OffersBasedOnCountry offr;
	
	public OffersBasedOnCountry getOffr() {
		return offr;
	}
	
	
	@Override
	public void showstatus() {
		System.out.println("your car is insured");
	}

}
