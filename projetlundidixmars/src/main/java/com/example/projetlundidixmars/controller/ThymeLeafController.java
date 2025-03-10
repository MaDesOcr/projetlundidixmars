package com.example.projetlundidixmars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.projetlundidixmars.service.NoteService;

@Controller
public class ThymeLeafController {
	
	NoteService noteService;
	
	public ThymeLeafController(NoteService noteService) {
		this.noteService = noteService;
	}
	
	
	@GetMapping("/firsttlt")
	public String getTLT(Model model) {
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "tlt";
	}

	@PostMapping("/firsttlt")
	public String postTLT(Model model, @RequestParam String nomnote) {
		//data.getNotes().add(new Note(nomnote, LocalDate.now()));
		//noteService.addNote(new Note(nomnote, LocalDate.now()));
		
		// création d'une note en passant seulement le content
		noteService.addNote(nomnote);
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "tlt";
	}
	
	
	//nouveau mapping qui va prendre un @RequestParam -> id de la note
	//qui va appeler une méthode du noteService deleteNoteById
	
	@PostMapping("/deletetlt")
	public String deleteNote(Model model, @RequestParam int id) {
		noteService.deleteNoteById(id);
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "tlt";
	}
	
}
