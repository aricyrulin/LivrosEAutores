package com.desafiofuchs.livros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiofuchs.livros.models.Livro;
import com.desafiofuchs.livros.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	// Return list of livros
	public List<Livro> getLivros(){
		return livroRepository.findAll();
	}
}
