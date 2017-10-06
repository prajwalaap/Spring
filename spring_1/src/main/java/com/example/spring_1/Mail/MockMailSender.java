package com.example.spring_1.Mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component  without using componenet annotation we can create bean using @Configuration annotation in different class
@Qualifier("mock")
public class MockMailSender implements MailSender_Interface {
	private static Log log = LogFactory.getLog(MockMailSender.class);

	@Override
	public void sendMail(String to, String sub, String body) {
		log.info("Sending MackMail to" + to);
		log.info("with subject" + sub);
		log.info("with body" + body);
	}

}
