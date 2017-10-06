package com.DIusingconstructor;

public class BikeInsurance implements Insurance{
 private Offer offr;
 
	public BikeInsurance(Offer offr) {
//	this.offr = offr;
	System.out.println(offr.showStatus());
}
	@Override
	public String showStatus() {
		return "your bike is insured";
	}


}
