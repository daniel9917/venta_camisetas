package com.proyecto.springboot.form.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.repository.EstampadoRepository;

@Service
@Transactional(readOnly = true)
public class EstampadoService {
	
	
	private EstampadoRepository estampadoResource;
	

	public EstampadoService() {

	}

	public EstampadoService(EstampadoRepository estampadoResource) {		
		this.estampadoResource = estampadoResource;
	}
	
    /**
     * save record
     * @param Estampado stamp model object
     * @return
     */
	@Transactional
	public Estampado create(Estampado stamp) {
		return this.estampadoResource.save(stamp); 
	}
	
    /**
     * update record
     * @param Estampado stamp model object
     * @return
     */
    @Transactional
	public Estampado update(Estampado stamp) {
		return this.estampadoResource.save(stamp); 
	}
	
    /**
     * delete record
     * @param Estampado stamp model object
     */
	@Transactional
	public void delete(Estampado stamp) {
		this.estampadoResource.delete(stamp);; 
	}
	
	
	/**
	 *gets a record that matches the id
	 *@param id row id
	 *@return 
	 */
	public Estampado findById(int id) {
		return this.estampadoResource.findById(id).get(); 
	}	
	
	/**
	 *gets all the records that match the fk_usuario id
	 *@param id row id
	 *@return 
	 */
	public List<Estampado> findByIdUsuario(Long id) {
		return this.estampadoResource.findByIdUsuario(id);
	}
	
	/**
	 *gets all records from Estampado table
	 *@param id row id
	 *@return 
	 */	
	public List<Estampado> findAll(Estampado stamp) {
		return this.estampadoResource.findAll(); 
	}
	
}