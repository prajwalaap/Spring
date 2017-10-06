package com.SpEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class BikeInsurance implements Insurance {
	@Autowired
	private Offer CurrentOffer;
	@Value("#{'service done with '+ offer.getGetOffer()}")
	private String service;
	@Value("#{'${User.names}'.split(',')}")
	private List<String> names;
	

	public List<String> getNames() {
		return names;
	}

	public String getService() {
		return service;
	}

	public Offer getCurrentOffer() {
		return CurrentOffer;
	}


}
