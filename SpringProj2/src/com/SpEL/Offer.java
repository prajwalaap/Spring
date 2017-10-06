package com.SpEL;

import org.springframework.stereotype.Component;

@Component("offer")
public class Offer {
	String getOffer = "No offers";

	public String getGetOffer() {
		return getOffer;
	}

	public void setGetOffer(String getOffer) {
		this.getOffer = getOffer;
	}

}
