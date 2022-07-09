package com.galdy.sistemaestudantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galdy.sistemaestudantes.model.Aluno;
import com.galdy.sistemaestudantes.repository.AlunoRepository;
import com.galdy.sistemaestudantes.service.AlunoService;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "*", allowedHeaders= "*")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	@Autowired
	private AlunoRepository repository;
	
	@PostMapping("/add")
	public String add(@RequestBody Aluno aluno) {
		service.saveAluno(aluno);
		return "Aluno cadastrado com sucesso";
	}
	
	@GetMapping("/getAll")
	public List<Aluno> getAllAluno(){
		return service.getAllAluno();
	}
	
	@PutMapping
	public ResponseEntity<Aluno> put(@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	
	
}
