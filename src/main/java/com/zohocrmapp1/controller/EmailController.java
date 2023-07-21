package com.zohocrmapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.util.EmailServices;

@Controller
public class EmailController {
	
	@Autowired
	EmailServices emailservices;

	@RequestMapping("/sendMail")
	public String SendEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@RequestMapping("/composemail")
	  public String composeMail(@RequestParam("email")String to,@RequestParam("subject")String subject,@RequestParam("content")String content,ModelMap model) {
		
		emailservices.sendingEmail(to, subject, content);
		
		model.addAttribute("msg", "email sent!!!");
		return "compose_email";
	}
}
