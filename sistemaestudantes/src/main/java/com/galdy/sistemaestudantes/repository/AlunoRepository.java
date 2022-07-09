package com.galdy.sistemaestudantes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galdy.sistemaestudantes.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	public List<Aluno> findAllByAlunoContainingIgnoreCase(String aluno);
	
}
