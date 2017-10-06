package com.example.spring_1.Mail;

import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//@Component  without using componenet annotation we can create bean using @Configuration annotation in different class
//@Qualifier("smtp")
public class SMTPMailSender implements MailSender_Interface {
	private static Log log = LogFactory.getLog(SMTPMailSender.class);

	private JavaMailSender javaMailSender;
	
	public SMTPMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendMail(String to, String sub, String body) throws Exception{
      MimeMessage message = javaMailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message,true);   //true indicates multipart message
      helper.setTo(to);
      helper.setSubject(sub);
      helper.setText(body,true);  //true indicates html body
      javaMailSender.send(message);
	}

//	@Override
//	public void sendMail(String to, String sub, String body) {
//		log.info("Sending SMTPMail to " + to);
//		log.info("with subject " + sub);
//		log.info("with body " + body);
//	}

}
