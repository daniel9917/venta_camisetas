package com.proyecto.springboot.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.springboot.form.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
		

}
