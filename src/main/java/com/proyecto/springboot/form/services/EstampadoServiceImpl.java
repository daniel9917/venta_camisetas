package com.proyecto.springboot.form.services;

import java.util.Collection;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.form.model.Estampado;

@Service
public class EstampadoServiceImpl implements IEstampadoService{

	private boolean success;
	
	@Override
	public String createEstampado(Estampado e) {
		if (success) 
			return "The register was successfully added.";							
		else
			return "Unable to create the register, please try again.";
	}

	@Override
	public String updateEstampado(JSONObject id) {
		
		if (success) 
			return "The register was updated added.";							
		else
			return "Unable to update the register, please try again.";		
		
	}

	@Override
	public String deleteEstampado(Long id) {
		if (success) 
			return "The register was successfully deleted.";							
		else
			return "Unable to delete the register, please try again.";		
	}



}
