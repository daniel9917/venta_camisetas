package com.proyecto.springboot.form.services;

import java.util.Collection;

import com.proyecto.springboot.form.model.Estampado;

public interface IArtistaService {
	
	public abstract Collection<Estampado> getEstampados(Long id);

}
