package com.proyecto.springboot.form.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Persona;
import com.proyecto.springboot.form.repository.PersonaRepository;

@Service
@Transactional(readOnly = true)
public class PersonaService {
		
	@Autowired
	public PersonaRepository personaRepository;
	
	/**
	 * Creates a record given an entity
	 */
	public Persona create (Persona persona) {
		return personaRepository.save(persona);			
	}	
	
	/**
	 * Updates a record given an entity
	 */	
	public Persona update (Persona persona) {
		return personaRepository.save(persona);
	}
	
	/**
	 * Deletes a record given an integer
	 */
	public void deleteById (int id) {		
		personaRepository.deleteById(id);
	}
	
	/**
	 * Deletes a record given an entity
	 */	
	public void delete (Persona persona)  {
		personaRepository.delete(persona);
	}
	
	/**
	 * Finds a register given an id
	 */
	public Persona findById (int id) {
		return personaRepository.findById(id).get();
	}
	
	/**
	 * finds all the records
	 */
	public List<Persona> findAll (){
		return personaRepository.findAll();
	}

}
