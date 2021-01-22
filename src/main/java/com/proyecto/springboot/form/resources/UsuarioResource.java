package com.proyecto.springboot.form.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.model.Usuario;
import com.proyecto.springboot.form.services.EstampadoService;
import com.proyecto.springboot.form.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/usuario")
@Api("usuario")
public class UsuarioResource {
	
	private final UsuarioService usuarioService;
	private final EstampadoService estampadoService;

	public UsuarioResource(UsuarioService usuarioService, EstampadoService estampadoService) {		
		this.usuarioService = usuarioService;
		this.estampadoService = estampadoService;
				
	}
	
    @GetMapping
    @ApiOperation(value = "find all", notes = "get all rows without any condition")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity<List<Usuario>> findAll(){
		return ResponseEntity.ok(this.usuarioService.findAll());
	}
	
    @GetMapping("/{id}")
    @ApiOperation(value = "find by id", notes = "retrieves a set of rows that match the specified id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity<Usuario> findById(@PathVariable("id") int id){
		return ResponseEntity.ok(this.usuarioService.findById(id));
	}
	
    //Especificar url
    @GetMapping("/{fkusuario_id}&")
    @ApiOperation(value = "find Estampado by Id Usuario", notes = "retrieves a set of rows that match the specified fk_idusuario id in table Estampado ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity<List<Estampado>> findEstampaByIdUsuario(@PathVariable("fkusuario_id")Long id){
		return ResponseEntity.ok(this.estampadoService.findByIdUsuario(id));		
	}
	
    
    @PostMapping("/createestamapa")
    @ApiOperation(value = "create estampado", notes = "creates a single register in table Estampado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity<Estampado> createEstampado (Estampado estampa){
		return ResponseEntity.ok(this.estampadoService.create(estampa));			
	}

	/*
	 * Puede ser void?
	 * ¿Por qué todo el objeto como parámetro y no sólo el id?
	 * */
    @GetMapping("/delete")
    @ApiOperation(value = "delete estampado", notes = "delets a single row that matches the entity")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity deleteEstampado(Estampado estampa) {
		return (ResponseEntity) ResponseEntity.ok();
		
	}
	
    
    @PostMapping("/update")
    @ApiOperation(value = "update estampado", notes = "Updates de value that matches the entity")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
	public ResponseEntity<Estampado> updateEstampado(Estampado estampa) {
		return ResponseEntity.ok(this.estampadoService.update(estampa));
	}
	
	
	
	
	
	

}
