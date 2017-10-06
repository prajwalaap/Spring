package com.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
@Scope("prototype")
public class BikeInsurance implements Insurance {
	@Autowired
	Offer CurrentOffer;

	public Offer getCurrentOffer() {
		return CurrentOffer;
	}


}
