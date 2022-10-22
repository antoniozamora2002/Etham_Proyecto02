package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.FacultadService;
import com.ayllusinchi.upeu.entidades.Facultad;
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
@RequestMapping("/facultad")
@Api(value = "Microservicio de Gestion de las facultades", description = "Microservicio de Gestion de las facultades")
public class FacultadController {
    
    @Autowired
    FacultadService facultadService;
    
    @ApiOperation(value = "Lista de facultades")
    @GetMapping("/all")
    public List<Facultad> findAll(){
        return facultadService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de una facultad")
    @GetMapping("/{id}")
    public ResponseEntity<Facultad> findById(@PathVariable Long id){
        Facultad facultad = facultadService.findById(id);
        return ResponseEntity.ok(facultad);
    }
    
    @ApiOperation(value = "Crea una facultad")
    @PostMapping("/save")
    public Facultad save(@RequestBody Facultad facultad){
        return facultadService.save(facultad);
    }
    
    @ApiOperation(value = "Modifica una facultad")
    @PutMapping("/update")
    public Facultad update(@RequestBody Facultad facultad){
        return facultadService.save(facultad);
    }
    
    @ApiOperation(value = "Elimina una facultad")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        facultadService.deleteById(id);
    }
    
}
