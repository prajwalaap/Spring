package com.udemy.annotation;

import org.springframework.stereotype.Component;

@Component("OfferIndia")
public class OffersIndia implements OffersBasedOnCountry{

	@Override
	public String getOfffer() {
		return "get 10% off (INDIA)";
	}
	

}
