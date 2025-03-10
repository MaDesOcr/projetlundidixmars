package com.example.projetlundidixmars.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.projetlundidixmars.data.Data;
import com.example.projetlundidixmars.model.Note;

@Service
public class NoteService {

	Data data = new Data();
	
	public NoteService() {
		data.getNotes().add(new Note("Premiere Note", LocalDate.now()));
	}
	
	public ArrayList<Note> getAllNotes(){
		return data.getNotes();
	}
	
	public void addNote(Note noteToAdd) {
		data.getNotes().add(noteToAdd);
	}
	
}
