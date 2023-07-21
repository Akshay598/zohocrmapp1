package com.zohocrmapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp1.entities.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
