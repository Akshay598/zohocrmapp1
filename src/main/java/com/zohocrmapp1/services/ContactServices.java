package com.zohocrmapp1.services;

import java.util.List;

import com.zohocrmapp1.entities.Contact;

public interface ContactServices {

	public	void saveOneContact(Contact contact);

	public List<Contact> listAll();



}
