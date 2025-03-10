package com.example.projetlundidixmars.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.example.projetlundidixmars.model.Note;

public class Data {

	private ArrayList<Note> notes;
	
	public Data() {
		notes = new ArrayList<Note>();
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
	
	
	
}
