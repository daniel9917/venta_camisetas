package com.proyecto.springboot.form.repository;

import com.proyecto.springboot.form.model.Camiseta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * interface que implementa la firma los métodos generales para las consultas.
 * al extender de un JpaRepository proveé de sus métodos de consulta ya pre construidos
 * @author juacnsr
 */
public interface CamisetaRepository extends JpaRepository<Camiseta, Integer> {

}
