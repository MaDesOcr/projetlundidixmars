package com.example.projetlundidixmars.model;

import java.time.LocalDate;

public class Note {

	private int id;
	private String content;
	private LocalDate date;
		
	public Note() {
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
	
	
	
	
}
