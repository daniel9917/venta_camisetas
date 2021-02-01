package com.proyecto.springboot.form.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Persona;
import com.proyecto.springboot.form.services.PersonaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/persona")
@Api("persona")
public class PersonaResource {

	private PersonaService personaService;

	public PersonaResource(PersonaService personaService) {		
		this.personaService = personaService;
	}
	
	@GetMapping
    @ApiOperation(value = "find all", notes = "get all rows without any condition")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<List<Persona>> findAll() {
        return ResponseEntity.ok(this.personaService.findAll());
    }
	
    
    @GetMapping("/{id}")
    @ApiOperation(value = "get", notes = "get a record by its id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Persona> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(this.personaService.findById(id), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    @ApiOperation(value = "post", notes = "insert a new record")
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "created"),
        @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Persona> create(Persona persona) {        
    	return new ResponseEntity<>(this.personaService.create(persona), HttpStatus.OK);
        
    }
}
