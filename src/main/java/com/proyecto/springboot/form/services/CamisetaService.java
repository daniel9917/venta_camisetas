package com.proyecto.springboot.form.services;

import com.proyecto.springboot.form.model.Camiseta;
import com.proyecto.springboot.form.repository.CamisetaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Clase para establecer las consultas generales a los modelos
 * @author juancsr
 */
@Service
@Transactional(readOnly = true)
public class CamisetaService {
    private final CamisetaRepository camisetaRepository;

    public CamisetaService(CamisetaRepository camisetaRepository) {
        this.camisetaRepository = camisetaRepository;
    }

    /**
     * save record
     * @param camiseta camiseta model object
     * @return
     */
    @Transactional
    public Camiseta create(Camiseta camiseta) {
        return this.camisetaRepository.save(camiseta);
    }

    /**
     * update record
     * @param camiseta camiseta model object
     * @return
     */
    @Transactional
    public Camiseta update(Camiseta camiseta) {
        return this.camisetaRepository.save(camiseta);
    }

    /**
     * delete record
     * @param camiseta camiseta model object
     */
    @Transactional
    public void delete(Camiseta camiseta) {
        this.camisetaRepository.delete(camiseta);
    }

    /**
     * get a record by its id
     * @param id row id
     * @return
     */
    public Camiseta findById(int id) {
        return this.camisetaRepository.findById(id).get();
    }

    /**
     * get all records from camiseta table
     * @return
     */
    public List<Camiseta> findAll() {
        return this.camisetaRepository.findAll();
    }
}
