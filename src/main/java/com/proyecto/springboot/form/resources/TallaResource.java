package com.proyecto.springboot.form.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Talla;
import com.proyecto.springboot.form.services.TallaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/talla")
@Api("talla")
public class TallaResource {
	
	private TallaService tallaService;

	public TallaResource(TallaService tallaService) {	
		this.tallaService = tallaService;
	}
	
	
    @GetMapping
    @ApiOperation(value = "find all", notes = "get all rows without any condition")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<List<Talla>> findAll(){
    	return ResponseEntity.ok(this.tallaService.findAll());
    }
	
    @GetMapping("/{id}")
    @ApiOperation(value = "find by id", notes = "gets a row by matching the id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Talla> findById(@PathVariable("id") int id){
    	return ResponseEntity.ok(this.tallaService.findById(id));
    }
    
    
    @PostMapping("/create")
    @ApiOperation(value = "create", notes = "creates a single register")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Talla> create (Talla talla){
    	return ResponseEntity.ok(this.tallaService.create(talla));
    	
    }
    
    
    @PostMapping("/createtest")
    @ApiOperation(value = "testcreate", notes = "creates a single register")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<String> create (String test){
    	return ResponseEntity.ok("Test satisfactorio "+test);    	
    }
    
    
	

}
