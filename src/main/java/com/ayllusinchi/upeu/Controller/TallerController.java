package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.TallerService;
import com.ayllusinchi.upeu.entidades.Taller;
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
@RequestMapping("/talleres")
@Api(value = "Microservicio de Gestion de los talleres", description = "Microservicio de Gestion de los talleres")
public class TallerController {
    
   @Autowired
   TallerService tallerService;
    
    @ApiOperation(value = "Lista de talleres")
    @GetMapping("/all")
    public List<Taller> findAll(){
        return tallerService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un taller")
    @GetMapping("/{id}")
    public ResponseEntity<Taller> findById(@PathVariable Long id){
        Taller taller = tallerService.findById(id);
        return ResponseEntity.ok(taller);
    }
    
    @ApiOperation(value = "Crea un taller")
    @PostMapping("/save")
    public Taller save(@RequestBody Taller taller){
        return tallerService.save(taller);
    }
    
    @ApiOperation(value = "Modifica un taller")
    @PutMapping("/update")
    public Taller update(@RequestBody Taller taller){
        return tallerService.save(taller);
    }
    
    @ApiOperation(value = "Elimina un taller")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        tallerService.deleteById(id);
    }
    
}
