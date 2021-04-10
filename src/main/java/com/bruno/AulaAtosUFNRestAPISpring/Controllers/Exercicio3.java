package com.bruno.AulaAtosUFNRestAPISpring.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Valor;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/parImpar")
public class Exercicio3 {
	
	@ApiOperation(value = "Recebe um número e retorne se este é par ou impar", response = Iterable.class)
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)			
	public String adicionar(@RequestBody Valor valor) {
		
		String resul;
		
		if(valor.valor%2==0) {
			resul = "Par";
		}else {
			resul = "Impar";
		}
		
	return resul;
	}

}