package com.desafiofuchs.livros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiofuchs.livros.models.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
