package com.example.spring_1.Mail;

public interface MailSender_Interface {

	public void sendMail(String to,String sub,String body) throws Exception;
}
