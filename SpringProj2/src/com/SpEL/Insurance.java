package com.SpEL;

import java.util.List;

public interface Insurance {
	public Offer getCurrentOffer();

	public List<String> getNames();
	public String getService();
}
