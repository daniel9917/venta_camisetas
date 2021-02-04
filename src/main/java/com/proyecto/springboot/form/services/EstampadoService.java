package com.proyecto.springboot.form.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.repository.EstampadoRepository;

@Service
@Transactional(readOnly = true)
public class EstampadoService {
	
	
	private EstampadoRepository estampadoRepository;

	public EstampadoService(EstampadoRepository estampadoRepository) {
		this.estampadoRepository = estampadoRepository;
	}
	
    /**
     * save record
     * @param stamp model object
     * @return
     */
	@Transactional
	public Estampado create(Estampado stamp) {
		return this.estampadoRepository.save(stamp);
	}
	
    /**
     * update record
     * @param stamp model object
     * @return
     */
    @Transactional
	public Estampado update(Estampado stamp) {
		return this.estampadoRepository.save(stamp);
	}
	
    /**
     * delete record
     * @param stamp model object
     */
	@Transactional
	public void delete(Estampado stamp) {
		this.estampadoRepository.delete(stamp);;
	}
	
	
	/**
	 *gets a record that matches the id
	 *@param id row id
	 *@return 
	 */
	public Estampado findById(int id) {
		return this.estampadoRepository.findById(id).get();
	}	
	
	/**
	 *gets all the records that match the fk_usuario id
	 *@param id row id
	 *@return 
	 */
	public List<Estampado> findByIdUsuario(Long id) {
		return this.estampadoRepository.findByIdUsuario(id);
	}
	
	/**
	 *gets all records from Estampado table
	 *@return 
	 */	
	public List<Estampado> findAll() {
		return this.estampadoRepository.findAll();
	}
	
    /**
     * gets all records sorted by specified option:
     * 
     * Options are:
     * 1. Popularity
     * 2. Rating
     * 3. Author
     * 4. topic
     * 
     * So if topic is selected, it will sort the records to groups
     * with the same topic
     */
//	public List<Estampado> getByFilter(int filter){
//		List<Estampado> records = this.findAll();
//		int longitud = records.size();		
//		
//		switch (filter) {
//			case 1:
//				//Insert code to filer by popularity
//			break;
//			case 2:
//				//Insert code to filter by rating			
//			break;
//			case 3:
//				//code to filter by author
//				for (int i = 0; i < longitud; i++) {
//					
//					if (i == longitud - 1)
//						break;
//					for (int j = i + 1; j < longitud; j++) {
//						if (j == longitud - 1)
//							break;
//						
//						if (records.get(i).getIdUsuario() == records.get(i + 1).getIdUsuario() ) {
//							break;
//						}
//						else if (records.get(i).getIdUsuario() == records.get(j).getIdUsuario() ) {
//							Estampado temp = records.get(i + 1);
//							records.set(i + 1, records.get(j));
//							records.set(j, temp);
//							
//						}
//						
//					}
//				}
//			return records;
//			case 4:
//				//code to filter by topic
//				for (int i = 0; i < longitud; i++) {
//					
//					if (i == longitud - 1)
//						break;
//					for (int j = i + 1; j < longitud; j++) {
//						if (j == longitud - 1)
//							break;
//						
//						if (records.get(i).getIdTema() == records.get(i + 1).getIdTema()) {
//							break;
//						}
//						else if (records.get(i).getIdTema() == records.get(j).getIdTema() ) {
//							Estampado temp = records.get(i + 1);
//							records.set(i + 1, records.get(j));
//							records.set(j, temp);
//							
//						}
//						
//					}
//				}
//			return records;
//			
//		}
//		return records;	
//			
//		
//	}
//	
}