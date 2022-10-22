package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.PersonaTallerService;
import com.ayllusinchi.upeu.entidades.PersonaTaller;
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
@RequestMapping("/personataller")
@Api(value = "Microservicio de Gestion de las personas en los talleres", description = "Microservicio de Gestion de las personas en los talleres")
public class PersonaTallerController {
    
    @Autowired
    PersonaTallerService personaTallerService;
    
    @ApiOperation(value = "Lista de personas en los talleres")
    @GetMapping("/all")
    public List<PersonaTaller> findAll(){
        return personaTallerService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de una persona")
    @GetMapping("/{id}")
    public ResponseEntity<PersonaTaller> findById(@PathVariable Long id){
        PersonaTaller personaTaller = personaTallerService.findById(id);
        return ResponseEntity.ok(personaTaller);
    }
    
    @ApiOperation(value = "Crea una persona")
    @PostMapping("/save")
    public PersonaTaller save(@RequestBody PersonaTaller personaTaller){
        return personaTallerService.save(personaTaller);
    }
    
    @ApiOperation(value = "Modifica una persona")
    @PutMapping("/update")
    public PersonaTaller update(@RequestBody PersonaTaller personaTaller){
        return personaTallerService.save(personaTaller);
    }
    
    @ApiOperation(value = "Elimina una persona")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        personaTallerService.deleteById(id);
    }
    
}
