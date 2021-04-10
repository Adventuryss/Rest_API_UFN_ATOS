package com.bruno.AulaAtosUFNRestAPISpring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.UrnaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/eleicao")
public class Exercicio4 {

	@Autowired
	private UrnaRepository urnaRepository;

	public Integer contador01 = 0;
	public Integer contador02 = 0;

	@ApiOperation(value = "Vote para prefeito 15 ou 20", response = Iterable.class)
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Votos adicionar(@RequestBody Votos votos) {

		if (votos.numeroCandidato == 15) {
			contador01 = contador01 + 1;
		} else if(votos.numeroCandidato == 20) {
			contador02 = contador02 + 1;
		}

		return urnaRepository.save(votos);
	}

	@ApiOperation(value = "Resultado eleição:", response = Iterable.class)
	@GetMapping // resultado
	public String getVotos() {
		String msg;
		if (contador01 > contador02) {
			msg = "O candidato 15 venceu. Com "+contador01+" votos!";
		} else if (contador02 == contador01) {
			msg = "Empate";
		} else {
			msg = "O candidato 20 venceu. Com "+contador02+" votos!";
		}
		return msg;
	}

	
	@ApiOperation(value = "Consulta candidato(numero do candidato):", response = Iterable.class) 
	@GetMapping(value="/numerocandidato/{numerocandidato}")
	public List<Votos> getUsersByAno(@PathVariable Integer numerocandidato) {
		return urnaRepository.findByNumeroCandidato(numerocandidato);
}
	

}