package com.bruno.AulaAtosUFNRestAPISpring.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Temperatura;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/temperatura")
public class Exercicio2 {
	
	@ApiOperation(value = "Recebe a temperatura em fahrenheit e retorne em celsius", response = Iterable.class)
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)			//cria
	public Float adicionar(@RequestBody Temperatura temperatura) {		
		return (temperatura.temperatura-32)/1.8f;
	}
	

}