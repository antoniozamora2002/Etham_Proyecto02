/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ayllusinchi.upeu.Services;

import com.ayllusinchi.upeu.entidades.Encuesta;
import java.util.List;

/**
 *
 * @author marco
 */
public interface EncuestaService {
    
    public List<Encuesta> findAll();
    public Encuesta findById(Long id);
    public Encuesta save(Encuesta encuesta);
    public void delete(Encuesta encuesta);
    public void deleteById(Long id);
    
    
}
