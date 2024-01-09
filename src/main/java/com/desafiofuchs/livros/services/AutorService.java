package com.desafiofuchs.livros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiofuchs.livros.models.Autor;
import com.desafiofuchs.livros.repositories.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> getAutores() {
		return autorRepository.findAll();
	}
}
