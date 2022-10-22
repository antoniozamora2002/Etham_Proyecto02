package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.CarreraService;
import com.ayllusinchi.upeu.entidades.Carrera;
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
@RequestMapping("/carrera")
@Api(value = "Microservicio de Gestion de las carreras", description = "Microservicio de Gestion de las carreras")
public class CarreraController {
    
    @Autowired
    CarreraService carreraService;
    
    @ApiOperation(value = "Lista de carreras")
    @GetMapping("/all")
    public List<Carrera> findAll(){
        return carreraService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de una carrera")
    @GetMapping("/{id}")
    public ResponseEntity<Carrera> findById(@PathVariable Long id){
        Carrera carrera = carreraService.findById(id);
        return ResponseEntity.ok(carrera);
    }
    
    @ApiOperation(value = "Crea una carrera")
    @PostMapping("/save")
    public Carrera save(@RequestBody Carrera carrera){
        return carreraService.save(carrera);
    }
    
    @ApiOperation(value = "Modifica una carrera")
    @PutMapping("/update")
    public Carrera update(@RequestBody Carrera carrera){
        return carreraService.save(carrera);
    }
    
    @ApiOperation(value = "Elimina una carrera")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        carreraService.deleteById(id);
    }
    
}
