package com.proyecto.springboot.form.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Talla;
import com.proyecto.springboot.form.repository.TallaRepository;

@Service
public class TallaService {
	
	@Autowired
	private TallaRepository tallaRepository;
	
	//creates a row
	@Transactional
	public Talla create (Talla talla) {
		return this.tallaRepository.save(talla);
	}
		
	//modifies a row
	@Transactional
	public Talla update (Talla talla) {
		return this.tallaRepository.save(talla);
	}
	
	//deletes a row	
	@Transactional
	public void delete (Talla talla) {
		this.tallaRepository.delete(talla);
	}
	
	//finds a rows by matching the id
	public Talla findById(int id) {
		return this.tallaRepository.findById(id).get();
	}
	
	//gets all of the rows	
	public List<Talla> findAll(){
		return this.tallaRepository.findAll();
	}
	
	

}
