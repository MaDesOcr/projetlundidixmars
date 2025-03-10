package com.example.projetlundidixmars.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.projetlundidixmars.model.Note;
import com.example.projetlundidixmars.service.NoteService;

@Controller
public class ThymeLeafController {
	
	NoteService noteService = new NoteService();
	
	@GetMapping("/firsttlt")
	public String getTLT(Model model) {
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "tlt";
	}
	
	@PostMapping("/firsttlt")
	public String postTLT(Model model, @RequestParam String nomnote) {
		noteService.addNote(new Note(nomnote, LocalDate.now()));
		model.addAttribute("listenotes", noteService.getAllNotes());
		return "tlt";
	}
}
