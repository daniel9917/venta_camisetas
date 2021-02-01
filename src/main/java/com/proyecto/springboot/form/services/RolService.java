package com.proyecto.springboot.form.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Rol;
import com.proyecto.springboot.form.repository.RolRepository;

@Service
@Transactional(readOnly = true)
public class RolService {
	
	@Autowired
	public RolRepository rolRepository;
	
	public Rol create(Rol rol) {		
		return rolRepository.save(rol);		
	}
	
	public Rol update(Rol rol) {		
		return rolRepository.save(rol);		
	}
	
	public void deleteById (int id) {
		rolRepository.deleteById(id);
	}
	
	public void delete (Rol rol) {
		rolRepository.delete(rol);
	}
	
	public Rol findById(int id) {
		return this.rolRepository.findById(id).get();		
	}
	
	public List<Rol> findAll(){
		return this.rolRepository.findAll();
	}

}
