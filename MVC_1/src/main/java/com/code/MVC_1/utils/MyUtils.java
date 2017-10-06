package com.code.MVC_1.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MyUtils {
	private static MessageSource messageSource;
	public MyUtils(MessageSource messageSource) {
		MyUtils.messageSource = messageSource;
	}
	public static Object getmessage(String messageKey, Object...args) {
		
		return  messageSource.getMessage(messageKey,args,LocaleContextHolder.getLocale());
	}

	

}
