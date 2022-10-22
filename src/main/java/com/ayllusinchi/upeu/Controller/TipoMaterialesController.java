package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.TipoMaterialesService;
import com.ayllusinchi.upeu.entidades.TipoMateriales;
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
@RequestMapping("/tipomateriales")
@Api(value = "Microservicio de Gestion del tipo de materiales", description = "Microservicio de Gestion del tipo de materiales")
public class TipoMaterialesController {
    
    @Autowired
    TipoMaterialesService tipoMaterialesService;
    
    @ApiOperation(value = "Lista de tipo de materiales")
    @GetMapping("/all")
    public List<TipoMateriales> findAll(){
        return tipoMaterialesService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de tipo de materiales")
    @GetMapping("/{id}")
    public ResponseEntity<TipoMateriales> findById(@PathVariable Long id){
        TipoMateriales tipoMateriales = tipoMaterialesService.findById(id);
        return ResponseEntity.ok(tipoMateriales);
    }
    
    @ApiOperation(value = "Crea un tipo de materiales")
    @PostMapping("/save")
    public TipoMateriales save(@RequestBody TipoMateriales tipoMateriales){
        return tipoMaterialesService.save(tipoMateriales);
    }
    
    @ApiOperation(value = "Modifica un tipo de materiales")
    @PutMapping("/update")
    public TipoMateriales update(@RequestBody TipoMateriales tipoMateriales){
        return tipoMaterialesService.save(tipoMateriales);
    }
    
    @ApiOperation(value = "Elimina un tipo de materiales")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        tipoMaterialesService.deleteById(id);
    }
    
}
