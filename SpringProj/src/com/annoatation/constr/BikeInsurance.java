package com.annoatation.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("myInsurance")
public class BikeInsurance implements Insure{
	Offer offr;
public  BikeInsurance() {   }
	@Autowired     ///this autowired can be set false if we are not using offer like Autowired(required=false)
public BikeInsurance(Offer offr) {
		//this.offr = offr;
	offr.showstatus();
	}

public void showstatus() {
System.out.println("your bike is insured");
}

}
