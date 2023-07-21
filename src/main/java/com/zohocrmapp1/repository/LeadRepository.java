package com.zohocrmapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp1.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
