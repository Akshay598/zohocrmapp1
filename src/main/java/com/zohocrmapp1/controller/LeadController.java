package com.zohocrmapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.services.LeadServices;

@Controller
public class LeadController {
	
	@Autowired
	LeadServices leadservices;

	@RequestMapping("/viewleadpage")
	public String viewleadInfoLeadPage() {
		
		return "new_lead";
	}
	
	@RequestMapping("/savelead")
	public String savelead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadservices.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/list")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadservices.listAll();
		model.addAttribute("leads", leads);
		return "list_lead";
	}
	
	@RequestMapping("/viewlead")
	public String viewlead(@RequestParam("id") int id,ModelMap model) {
		Lead lead = leadservices.findOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
