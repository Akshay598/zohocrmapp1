package com.zohocrmapp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.repository.LeadRepository;

@Service
public class LeadServicesimpl implements LeadServices {
	
	@Autowired
    LeadRepository leadrepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		
		leadrepo.save(lead);

	}

	@Override
	public Lead findOneLead(int id) {
	Optional<Lead> findById = leadrepo.findById(id);
	Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(int id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
