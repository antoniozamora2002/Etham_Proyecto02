package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.ProgramaService;
import com.ayllusinchi.upeu.entidades.Programa;
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
@RequestMapping("/programas")
@Api(value = "Microservicio de Gestion de los programas", description = "Microservicio de Gestion de los programas")
public class ProgramaController {
    
    @Autowired
    ProgramaService programaService;
    
    @ApiOperation(value = "Lista de programas")
    @GetMapping("/all")
    public List<Programa> findAll(){
        return programaService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un programa")
    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable Long id){
        Programa programa = programaService.findById(id);
        return ResponseEntity.ok(programa);
    }
    
    @ApiOperation(value = "Crea una programa")
    @PostMapping("/save")
    public Programa save(@RequestBody Programa programa){
        return programaService.save(programa);
    }
    
    @ApiOperation(value = "Modifica un programa")
    @PutMapping("/update")
    public Programa update(@RequestBody Programa programa){
        return programaService.save(programa);
    }
    
    @ApiOperation(value = "Elimina un programa")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        programaService.deleteById(id);
    }
    
}
