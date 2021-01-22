package com.proyecto.springboot.form.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.form.model.Estampado;

public interface EstampadoRepository extends JpaRepository<Estampado, Integer> {
	
	public List<Estampado> findByIdUsuario(Long idUsuario);
	public List<Estampado> findByIdTema(Long idTema);		
	
}
