/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayllusinchi.upeu.Services.Impl;

import com.ayllusinchi.upeu.Repository.EncuestaRepository;
import com.ayllusinchi.upeu.Services.EncuestaService;
import com.ayllusinchi.upeu.entidades.Carrera;
import com.ayllusinchi.upeu.entidades.Encuesta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
 @Service
public class EncuestaServiceImpl implements EncuestaService {

    @Autowired
    EncuestaRepository encuestaRepository;
    
    @Override
    public List<Encuesta> findAll() {
                return (List<Encuesta>) encuestaRepository.findAll();
    }
    
    @Override
    public Encuesta findById(Long id) {
        return encuestaRepository.findById(id).orElse(null);
    }

    @Override
    public Encuesta save(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

    @Override
    public void delete(Encuesta encuesta) {
        encuestaRepository.delete(encuesta);
    }

    @Override
    public void deleteById(Long id) {
        encuestaRepository.deleteById(id);
    }

    
}
