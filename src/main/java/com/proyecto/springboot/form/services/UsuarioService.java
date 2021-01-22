package com.proyecto.springboot.form.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Usuario;

import com.proyecto.springboot.form.repository.UsuarioRepository;

@Service
@Transactional(readOnly = true)
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public UsuarioService() {
		
	}

    /**
     * saves record
     * @param usuario user model object
     * @return
     */
    @Transactional
	public Usuario create (Usuario user) {
		return this.usuarioRepository.save(user);		
	}
	
    /**
     * updates record
     * @param usuario user model object
     * @return
     */
	public Usuario update (Usuario user) {
		return this.usuarioRepository.save(user);		
	}
	
    /**
     * deletes record
     * @param usuario user model object
     */
	public void delete (Usuario user) {
		this.usuarioRepository.delete(user);		
	}
	
    /**
     * gets one record from table usuario that matches the id
     * @param id row id
     * @return
     */
	public Usuario findById(int id) {
		return this.usuarioRepository.findById(id).get();
	}
		
	/**
     * get all records from usuario table
     * @return
     */
	public List<Usuario> findAll(){
		return this.usuarioRepository.findAll();
	}

	
	

}
