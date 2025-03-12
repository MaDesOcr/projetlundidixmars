package com.example.projetlundidixmars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projetlundidixmars.model.Auteur;
import com.example.projetlundidixmars.repository.AuteurRepository;

@Service
public class AuteurService {

	private final AuteurRepository auteurRepository;
	
	public AuteurService(AuteurRepository auteurRepository) {
		this.auteurRepository = auteurRepository;
		auteurRepository.save(new Auteur("nomAuteurTest"));
	}
	
	public List<Auteur> getAllAuteurs() {
		return auteurRepository.findAll();
	}
	
	public void addAuteur(Auteur auteur) {
		this.auteurRepository.save(auteur);
	}
	
	public void addAuteur(String nom) {
		this.auteurRepository.save(new Auteur(nom));
	}
	
}
