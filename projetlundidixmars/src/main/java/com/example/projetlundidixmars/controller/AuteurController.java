package com.example.projetlundidixmars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projetlundidixmars.service.AuteurService;

@Controller
@RequestMapping("/auteur")
public class AuteurController {

	AuteurService auteurService;
	
	public AuteurController(AuteurService auteurService) {
		this.auteurService = auteurService;
	}
	
	@GetMapping("/")
	public String getAuteur(Model model) {
		model.addAttribute("auteurs", auteurService.getAllAuteurs());
		return "auteur";
	}
	
	
}
