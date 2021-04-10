package com.bruno.AulaAtosUFNRestAPISpring.Repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;





@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	
	
	public List<Cidade> findByAno(Integer ano);


	
}

