package com.galdy.sistemaestudantes.service;

import java.util.List;

import com.galdy.sistemaestudantes.model.Aluno;



public interface AlunoService {
	
	public Aluno saveAluno(Aluno aluno);
	public List<Aluno> getAllAluno();
	
}
