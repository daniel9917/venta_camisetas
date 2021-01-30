package com.proyecto.springboot.form.resources;

import com.proyecto.springboot.form.model.Camiseta;
import com.proyecto.springboot.form.services.CamisetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Clase para escribir los endpoints
 * @author juancsr
 */
@RestController
@RequestMapping("/camiseta")
@Api("camiseta")
public class CamisetaResource {

    private final CamisetaService camisetaService;

    public CamisetaResource(CamisetaService camisetaService) {
        this.camisetaService = camisetaService;
    }

    @GetMapping
    @ApiOperation(value = "find all", notes = "get all rows without any condition")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<List<Camiseta>> findAll() {
        return ResponseEntity.ok(this.camisetaService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get", notes = "get a record by its id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "correct"),
            @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Camiseta> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(this.camisetaService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    @ApiOperation(value = "post", notes = "insert a new record")
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "created"),
        @ApiResponse(code = 404, message = "error")
    })
    public ResponseEntity<Camiseta> create() {
        Camiseta camiseta = new Camiseta();
        return new ResponseEntity<>(this.camisetaService.create(camiseta), HttpStatus.OK);
    }
}
