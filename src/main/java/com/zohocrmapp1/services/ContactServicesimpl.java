package com.zohocrmapp1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.repository.ContactRepository;

@Service
public class ContactServicesimpl implements ContactServices {
	
	@Autowired
	ContactRepository contactrepo;

	@Override
	public void saveOneContact(Contact contact) {
		contactrepo.save(contact);
		
		
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

}
