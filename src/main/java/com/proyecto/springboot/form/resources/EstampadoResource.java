package com.proyecto.springboot.form.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.services.EstampadoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/estampado")
@Api("estampado")
public class EstampadoResource {
	
	
	private EstampadoService estampadoService;

	public EstampadoResource(EstampadoService estampadoService) {		
		this.estampadoService = estampadoService;
	}
	
    @GetMapping
    @ApiOperation(value = "find all", notes = "get all rows without any condition")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<List<Estampado>> findAll() {
        return ResponseEntity.ok(this.estampadoService.findAll());
    }
	
    
    @GetMapping("/{id}")
    @ApiOperation(value = "get", notes = "get a record by its id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Estampado> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(this.estampadoService.findById(id), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    @ApiOperation(value = "post", notes = "insert a new record")
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "created"),
        @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Estampado> create(Estampado estampado) {        
        return new ResponseEntity<>(this.estampadoService.create(estampado), HttpStatus.OK);
        
    }


}
