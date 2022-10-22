package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.MaterialesService;
import com.ayllusinchi.upeu.entidades.Materiales;
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
@RequestMapping("/materiales")
@Api(value = "Microservicio de Gestion de los materiales", description = "Microservicio de Gestion de los materiales")
public class MaterialesController {
    
    @Autowired
    MaterialesService materialesService;
    
    @ApiOperation(value = "Lista de materiales")
    @GetMapping("/all")
    public List<Materiales> findAll(){
        return materialesService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un material")
    @GetMapping("/{id}")
    public ResponseEntity<Materiales> findById(@PathVariable Long id){
        Materiales materiales = materialesService.findById(id);
        return ResponseEntity.ok(materiales);
    }
    
    @ApiOperation(value = "Crea un material")
    @PostMapping("/save")
    public Materiales save(@RequestBody Materiales materiales){
        return materialesService.save(materiales);
    }
    
    @ApiOperation(value = "Modifica un material")
    @PutMapping("/update")
    public Materiales update(@RequestBody Materiales materiales){
        return materialesService.save(materiales);
    }
    
    @ApiOperation(value = "Elimina un material")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        materialesService.deleteById(id);
    }
    
}
