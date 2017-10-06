package com.example.spring_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_1.Mail.MailSender_Interface;

@RestController
public class MailController {
	@Autowired
//	@Qualifier("smtp")
	private MailSender_Interface mailSender;
	
	
	
	//to overcome the ambiguity when we have two beans smtp and mock (when both classes were marked with @component) either we can use byname[autowired] with same name as respective
	//classes has or can give different name like @component("smtp")  
	
	
	//	@Autowired
	//	public MailController(MailSender_Interface smtp) {
	//		this.mailSender = smtp;
	//	}
	
	
	
//	@Autowired
//	public MailController(MailSender_Interface sMTPMailSender) {
//		this.mailSender = sMTPMailSender;
//	}
	@RequestMapping("/mail")
	public String sendingMail() throws Exception {
		mailSender.sendMail("prajwalaamberkar@gmail.com", "A Mock Mail", "A demo for mock mail");
		return "Mail has been sent";
	}

}
