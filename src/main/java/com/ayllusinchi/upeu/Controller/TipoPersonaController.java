package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.TipoPersonaService;
import com.ayllusinchi.upeu.entidades.TipoPersona;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author etham
 */

@RestController
@RequestMapping("/tipopersona")
@Api(value = "Microservicio de Gestion de los tipo de personas", description = "Microservicio de Gestion de los tipo de personas")
public class TipoPersonaController {
    
    @Autowired
    TipoPersonaService tipoPersonaService;
    
    @ApiOperation(value = "Lista de un tipo")
    @GetMapping("/all")
    public List<TipoPersona> findAll(){
        return tipoPersonaService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un tipo")
    @GetMapping("/{id}")
    public ResponseEntity<TipoPersona> findById(@PathVariable Long id){
        TipoPersona tipoPersona = tipoPersonaService.findById(id);
        return ResponseEntity.ok(tipoPersona);
    }
    
    @ApiOperation(value = "Crea un tipo")
    @PostMapping("/save")
    public TipoPersona save(@RequestBody TipoPersona tipoPersona){
        return tipoPersonaService.save(tipoPersona);
    }
    
    @ApiOperation(value = "Modifica un tipo")
    @PutMapping("/update")
    public TipoPersona update(@RequestBody TipoPersona tipoPersona){
        return tipoPersonaService.save(tipoPersona);
    }
    
    @ApiOperation(value = "Elimina un tipo")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        tipoPersonaService.deleteById(id);
    }
    
}
