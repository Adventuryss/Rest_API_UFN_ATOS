package com.bruno.AulaAtosUFNRestAPISpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Temperatura;



@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Long>{

}

