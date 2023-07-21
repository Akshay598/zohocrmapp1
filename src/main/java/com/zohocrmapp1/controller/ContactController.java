package com.zohocrmapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.services.ContactServices;
import com.zohocrmapp1.services.LeadServices;

@Controller
public class ContactController {
	
	@Autowired
	ContactServices contactservices;
	
	@Autowired
	LeadServices leadservice;
	
	@RequestMapping("/savecontact")
	public String saveContact(@RequestParam("id")int id,ModelMap model) {
		Lead leads = leadservice.findOneLead(id);
		Contact contact=new Contact();
		contact.setFirstName(leads.getFirstName());
		contact.setLastName(leads.getLastName());
		contact.setEmail(leads.getEmail());
		contact.setMobile(leads.getMobile());
		contact.setSource(leads.getSource());
		
		contactservices.saveOneContact(contact);
		leadservice.deleteOneLead(id);
		
		List<Contact> contacts = contactservices.listAll();
		model.addAttribute("contacts", contacts);
		return "list_contact";
	}
	
	@RequestMapping("/contacts")
	public String listAllLeads(ModelMap model) {
		List<Contact> contacts = contactservices.listAll();
		model.addAttribute("contacts", contacts);
		return "list_contact";
	}

}
