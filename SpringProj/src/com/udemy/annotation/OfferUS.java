package com.udemy.annotation;

import org.springframework.stereotype.Component;

@Component("OfferUS")
public class OfferUS implements OffersBasedOnCountry {

	@Override
	public String getOfffer() {
		return "get 15% off (US)";
	}

}
