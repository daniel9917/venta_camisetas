package com.proyecto.springboot.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.form.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
