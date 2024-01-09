package com.desafiofuchs.livros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desafiofuchs.livros.models.Autor;
import com.desafiofuchs.livros.services.AutorService;

@Controller
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@GetMapping("/autores")
	public String getAutores(Model model) {
		
		List<Autor> autoresList = autorService.getAutores();
		
		model.addAttribute("autores", autoresList);
		
		return "autores";
	}
}
