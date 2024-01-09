package com.desafiofuchs.livros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desafiofuchs.livros.models.Livro;
import com.desafiofuchs.livros.services.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping("/livros")
	public String getLivros(Model model) {
		
		List<Livro> livrosList = livroService.getLivros();
		
		model.addAttribute("livros", livrosList);
		
		return "livros";
	}
}
