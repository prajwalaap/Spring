package com.BeanScope;

import org.springframework.stereotype.Component;

@Component("Offer")
public class Offer {
	String getOffer = "No offers";

	public String getGetOffer() {
		return getOffer;
	}

	public void setGetOffer(String getOffer) {
		this.getOffer = getOffer;
	}

}
