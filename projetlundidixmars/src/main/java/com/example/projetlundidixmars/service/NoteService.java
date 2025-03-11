package com.example.projetlundidixmars.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.projetlundidixmars.data.Data;
import com.example.projetlundidixmars.model.Note;
import com.example.projetlundidixmars.repository.NoteRepository;

@Service
public class NoteService {

	NoteRepository noteRepository;	
	
	public NoteService(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
		this.noteRepository.save(new Note(0, "Premiere Note", LocalDate.now()));
	}
	
	public ArrayList<Note> getAllNotes(){
		return (ArrayList<Note>) noteRepository.findAll();
	}
	
	public void addNote(Note noteToAdd) {
		this.noteRepository.save(noteToAdd);
	}
	
	public void addNote(String content) {
		
		this.noteRepository.save(new Note(content, LocalDate.now()));
	}

	public void deleteNoteById(int id) {
		this.noteRepository.deleteById(id);
	}
}
