package com.bruno.AulaAtosUFNRestAPISpring.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;
import com.bruno.AulaAtosUFNRestAPISpring.Models.ProfessorAluno;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.CidadeRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.ProfessorAlunoRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.UrnaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/professorAluno")
public class Exercicio6 {

	@Autowired
	private ProfessorAlunoRepository professorAlunoRepository;


	@ApiOperation(value = "Cadastre o professor/aluno", response = Iterable.class)  // insert
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProfessorAluno adicionar(@RequestBody ProfessorAluno professorAluno) {
		return professorAlunoRepository.save(professorAluno);
	}
	
	@ApiOperation(value = "Consultar todos", response = Iterable.class) // consulta
	@GetMapping 		
	public List<ProfessorAluno> getProfessorAluno(){
	return professorAlunoRepository.findAll();	
	}


	@ApiOperation(value = "Deletar", response = Iterable.class)
	@DeleteMapping("/{id}")									// delete
	public void deleteProfessorAluno(@PathVariable Long id) {
		professorAlunoRepository.deleteById(id);
	}

	
	@ApiOperation(value = "Alterar", response = Iterable.class)
	@PutMapping("{id}")																
	public ProfessorAluno updateProfessorAluno(@RequestBody ProfessorAluno professorAluno, @PathVariable Long id) {
		
		ProfessorAluno p = professorAlunoRepository.getOne(id);
		
		if(p == null) {
			return null;
		}
		
		p.setNome(professorAluno.getNome());
		p.setTipo(professorAluno.getTipo());
		
		return professorAlunoRepository.save(p);
	}


	@ApiOperation(value = "Consulta por tipo(Professor ou Aluno):", response = Iterable.class) // consulta
	@GetMapping(value="/tipo/{tipo}")
	public List<ProfessorAluno> getUsersByTipo(@PathVariable String tipo) {
		return professorAlunoRepository.findByTipo(tipo);
	}
	
	

}