package com.bruno.AulaAtosUFNRestAPISpring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bruno.AulaAtosUFNRestAPISpring.Models.ProfessorAluno;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;

@Repository
public interface ProfessorAlunoRepository extends JpaRepository<ProfessorAluno, Long> {

	public List<ProfessorAluno> findByTipo(String tipo);
}

