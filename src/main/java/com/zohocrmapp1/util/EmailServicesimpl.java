package com.zohocrmapp1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServicesimpl implements EmailServices {
	
	@Autowired
	JavaMailSender mailsender;

	@Override
	public void sendingEmail(String to, String subject, String content) {
		
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		
		mailsender.send(message);

	}

}
