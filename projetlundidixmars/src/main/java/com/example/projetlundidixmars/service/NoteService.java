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
		data.getNotes().add(new Note(0, "Premiere Note", LocalDate.now()));
	}
	
	public ArrayList<Note> getAllNotes(){
		return data.getNotes();
	}
	
	public void addNote(Note noteToAdd) {
		data.getNotes().add(noteToAdd);
	}
	
	public void addNote(String content) {
		data.getNotes().add(
				new Note(data.getNotes().indexOf(data.getNotes().getLast())+1,
				content, LocalDate.now()));
	}
	//creation d'une autre méthode add qui prend uniquement le content
	//et qui créer une Note à partir de l'id libre dans de l'arrayList
	//le content, et la date

	public void deleteNoteById(int id) {
		data.getNotes().remove(id);
	}
}
