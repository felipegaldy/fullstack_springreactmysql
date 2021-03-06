package com.galdy.sistemaestudantes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galdy.sistemaestudantes.model.Aluno;
import com.galdy.sistemaestudantes.repository.AlunoRepository;


@Service
public class AlunoServiceImp implements AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	@Override
	public Aluno saveAluno(Aluno aluno) {
		return repository.save(aluno);
	}
	
	@Override
	public List<Aluno> getAllAluno(){
		return repository.findAll();
	}
	
}
