/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayllusinchi.upeu.Controller;

import com.ayllusinchi.upeu.Services.RespuestaEncuestaService;
import com.ayllusinchi.upeu.entidades.RespuestaEncuesta;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * @author marco
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/respuestaEncuestas")
@Api(value = "Microservicio de Gestion de los respuestaEncuestas", description = "Microservicio de Gestion de los respuestaEncuestas")
public class RespuestaEncuestaController {
    
    
    @Autowired
    RespuestaEncuestaService respuestaEncuestaService;

    @ApiOperation(value = "Lista de respuestaEncuestas")
    @GetMapping
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Lista de respuestaEncuestas");
        result.put("data", respuestaEncuestaService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtiene datos de un respuestaEncuesta")
    @GetMapping("/{id}")
    public ResponseEntity<RespuestaEncuesta> findById(@PathVariable Long id) {
        RespuestaEncuesta respuestaEncuesta = respuestaEncuestaService.findById(id);
        return ResponseEntity.ok(respuestaEncuesta);
    }

    
    @ApiOperation(value = "Crea un respuestaEncuesta")
    @PostMapping
    public ResponseEntity<?> save(@RequestBody RespuestaEncuesta respuestaEncuesta) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "RespuestaEncuesta registrado correctamente");
        result.put("data", respuestaEncuestaService.save(respuestaEncuesta));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    //a

    
    @ApiOperation(value = "Modifica un respuestaEncuesta")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody RespuestaEncuesta respuestaEncuesta) {
        HashMap<String, Object> result = new HashMap<>();
        RespuestaEncuesta data = respuestaEncuestaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            respuestaEncuesta.setRespenId(id);
            respuestaEncuestaService.save(respuestaEncuesta);
            result.put("success", true);
            result.put("message", "Datos actualizados correctamente.");
            result.put("data", respuestaEncuesta);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @ApiOperation(value = "Elimina un respuestaEncuesta")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        HashMap<String, Object> result = new HashMap<>();
    RespuestaEncuesta data = respuestaEncuestaService.findById(id);
    if(data == null){
        result.put("success", false);
        result.put("message", "No existe respuestaEncuesta con id:" + id);
  return new ResponseEntity <>(result, HttpStatus.NOT_FOUND);
    } else{
  respuestaEncuestaService.deleteById(id);
            result.put("success", true);
            result.put("message", "Registro Eliminado correctamente");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }
}
