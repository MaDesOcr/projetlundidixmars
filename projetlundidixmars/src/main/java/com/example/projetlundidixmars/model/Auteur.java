package com.example.projetlundidixmars.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Auteur {

	@Id
	private int id;
	
	private String nom;

    @OneToMany(mappedBy = "createur")
	private ArrayList<Note> notes = new ArrayList<Note>();
	
	
	
	public Auteur() {
		super();
	}



	public Auteur(int id, String nom, ArrayList<Note> notes) {
		super();
		this.id = id;
		this.nom = nom;
		this.notes = notes;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
