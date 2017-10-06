package com.example.spring_1.Mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

//can use @component also here but then @bean are not required 
//this configutration class is mainly used to create bean of the class whose source code will not be there we just add jar of that class in classpath
@Configuration
public class ConfigurationClass {
    
//	@Bean
//	public DemoBean demoBean(){
//		return new DemoBean();
//	}
	@Bean
	@ConditionalOnProperty(value = "spring.mail.host",havingValue = "foo",matchIfMissing = true)
	public MailSender_Interface mockMailSender()
	{
		return new MockMailSender();
	}
	
	@Bean
	@ConditionalOnProperty("spring.mail.host")
	public MailSender_Interface sMTPMailSender(JavaMailSender javaMailSender)
	{
		//demoBean();    //returns instance present in application context without creating new instance
		return new SMTPMailSender(javaMailSender);
	}
}
