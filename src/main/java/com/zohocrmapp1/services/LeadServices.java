package com.zohocrmapp1.services;

import java.util.List;

import com.zohocrmapp1.entities.Lead;

public interface LeadServices {

	void saveOneLead(Lead lead);

  public Lead findOneLead(int id);

public void deleteOneLead(int id);

public List<Lead> listAll();

}
