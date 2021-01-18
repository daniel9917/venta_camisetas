package com.proyecto.springboot.form.resources;

import com.proyecto.springboot.form.model.Camiseta;
import com.proyecto.springboot.form.services.CamisetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Clase para escribir los endpoints
 * @author juancsr
 */
@RestController
@RequestMapping(name = "/api/camiseta")
@Api(tags = "camiseta")
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
}
