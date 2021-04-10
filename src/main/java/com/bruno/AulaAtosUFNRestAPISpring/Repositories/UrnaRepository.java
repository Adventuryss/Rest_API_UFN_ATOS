package com.bruno.AulaAtosUFNRestAPISpring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;

@Repository
public interface UrnaRepository extends JpaRepository<Votos, Long> {

	public List<Votos> findByNumeroCandidato(Integer numerocandidato);
	
}

