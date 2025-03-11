package com.example.projetlundidixmars.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String content;
	private LocalDate date;
		
	@ManyToOne
	private Auteur createur;
	
	public Note() {
	}
	
	public Note(String content, LocalDate date) {
		super();
		this.content = content;
		this.date = date;
	}

	public Note(int id, String content, LocalDate date) {
		this.id = id;
		this.content = content;
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Auteur getCreateur() {
		return createur;
	}

	public void setCreateur(Auteur createur) {
		this.createur = createur;
	}
	
	
	
	
}
