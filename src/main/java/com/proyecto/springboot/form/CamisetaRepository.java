package com.proyecto.springboot.form;

import com.proyecto.springboot.form.model.Camiseta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamisetaRepository extends JpaRepository<Camiseta, String> {
}
