package com.desafiofuchs.livros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiofuchs.livros.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
