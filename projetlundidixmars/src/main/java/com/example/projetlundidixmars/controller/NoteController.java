package com.example.projetlundidixmars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.projetlundidixmars.service.AuteurService;
import com.example.projetlundidixmars.service.NoteService;

@Controller
@RequestMapping("/note")
public class NoteController {
	
	NoteService noteService;
	
	public NoteController(NoteService noteService) {
		this.noteService = noteService;
	}
	
	@GetMapping("/")
	public String getNotes(Model model) {
		model.addAttribute("listenotes", noteService.getAllNotes());
		//model.addAttribute("listeauteurs", auteurService.getAllAuteurs());
		return "note";
	}

	@PostMapping("/")
	public String createNote(Model model, @RequestParam String nomnote) {
		noteService.addNote(nomnote);
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "note";
	}
	
	@PostMapping("/deletenote")
	public String deleteNote(Model model, @RequestParam int id) {
		noteService.deleteNoteById(id);
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "note";
	}
	
}
