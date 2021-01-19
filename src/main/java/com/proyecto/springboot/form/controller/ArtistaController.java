package com.proyecto.springboot.form.controller;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.services.ArtistaService;
import com.proyecto.springboot.form.services.EstampadoServiceImpl;

import io.swagger.v3.oas.annotations.media.ArraySchema;


@RestController
@RequestMapping("/")
public class ArtistaController {
	
	
	
	@Autowired
	private EstampadoServiceImpl eservice;
	
	@Autowired
	private ArtistaService aservice;
	
	
	private Estampado estampa;
	
	@GetMapping("/{id}")
	public  JSONArray getEstampados (Long id) {		
		
		JSONArray Estampados= new JSONArray();
		
		/*Obtenemos la información de los estampados registrados del artista*/
		
		Collection<Estampado> estampados_artista = aservice.getEstampados(id);	
		Iterator<Estampado> iterator = estampados_artista.iterator();
		
		for (Estampado es : estampados_artista) {
			JSONObject estampado = new JSONObject();
			estampado.put("nombre",es.getNombre());
			estampado.put("id", es.getId());
			estampado.put("descripcion", es.getDescripcion());
			estampado.put("disponible", es.getDisponibleVenta());
			estampado.put("tema",es.getIdTema() );
			estampado.put("url","agregar atributo url a estampado" );
			Estampados.put(estampado);
		}
				
		return Estampados;
	}
		
	
	@RequestMapping(method = RequestMethod.PUT)
	public String crearEstampado (JSONObject estampado) {
		 
		estampa = new Estampado(
				estampado.getString("nombre"), 
				estampado.getString("nombre"),
				(java.sql.Date) new Date(), 
				(Long) estampado.get("idTema"), 
				(Long) estampado.get("idUsuario"));
		
		
		return eservice.createEstampado(estampa);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public String eliminarEstampado(Long id) {		
		return eservice.deleteEstampado(id);
		
	}
	
	@PostMapping("/")
	//Obtiene la estampa por id
	public String modificarEstampado(JSONObject estampado) {
		return eservice.updateEstampado(estampado);
	}
	
		
	
	
	


}
