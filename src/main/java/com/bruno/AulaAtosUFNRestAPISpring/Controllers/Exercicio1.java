package com.bruno.AulaAtosUFNRestAPISpring.Controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Temperatura;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hora")
public class Exercicio1 {

	
	@ApiOperation(value = "Retorne o data e a hora atual.", response = Iterable.class)
	@GetMapping
	public String getHoraeData(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

}