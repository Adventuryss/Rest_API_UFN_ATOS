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
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.CidadeRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.UrnaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cidade")
public class Exercicio5 {

	@Autowired
	private CidadeRepository cidadeRepository;


	@ApiOperation(value = "Cadastre a população de uma cidade para cada ano:", response = Iterable.class)  // insert
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cidade adicionar(@RequestBody Cidade cidade) {
		return cidadeRepository.save(cidade);
	}
	
	@ApiOperation(value = "Consultar todos:", response = Iterable.class) // consulta
	@GetMapping
	public List<Cidade> getCidade(){
	return cidadeRepository.findAll();	
	}


	@ApiOperation(value = "Deletar:", response = Iterable.class)
	@DeleteMapping("/{id}")									// delete
	public void deleteCidade(@PathVariable Long id) {
		cidadeRepository.deleteById(id);
	}
	

	
	@ApiOperation(value = "Alterar:", response = Iterable.class) // consulta
	@PutMapping("{id}")																
	public Cidade updateCidade(@RequestBody Cidade cidade, @PathVariable Long id) {
		
		Cidade c = cidadeRepository.getOne(id);
		
		if(c == null) {
			return null;
		}
		
		c.setAno(cidade.getAno());
		c.setPopulacao(cidade.getPopulacao());
		
		return cidadeRepository.save(c);
	}
	
	
	@ApiOperation(value = "Consulta por ano:", response = Iterable.class) // consulta
	@GetMapping(value="/ano/{ano}")
	public List<Cidade> getUsersByAno(@PathVariable Integer ano) {
		return cidadeRepository.findByAno(ano);
	}



}