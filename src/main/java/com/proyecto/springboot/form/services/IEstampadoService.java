package com.proyecto.springboot.form.services;

import java.util.Collection;

import org.json.JSONObject;

import com.proyecto.springboot.form.model.Estampado;

public interface IEstampadoService {
	
	public abstract String createEstampado (Estampado e);	
	public abstract String updateEstampado (JSONObject id);
	public abstract String deleteEstampado (Long id);
	
	

}
