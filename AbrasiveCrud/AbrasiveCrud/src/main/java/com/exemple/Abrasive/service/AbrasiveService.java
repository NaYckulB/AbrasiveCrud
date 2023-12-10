package com.exemple.Abrasive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Abrasive.domain.Abrasive;
import com.exemple.Abrasive.repository.AbrasiveRepository;

@Service
public class AbrasiveService {
	@Autowired
	private AbrasiveRepository repo;
	
	public List<Abrasive> listAll() {
		return repo.findAll();
	}
	public void save (Abrasive std) {
		repo.save(std);
	}
	public Abrasive get (long cod) {
		return repo.findById(cod).get();
		
	}
	public void delete(long cod) {
		repo.deleteById(cod);
		
	}
	
	
	

}
