/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ayllusinchi.upeu.Services;

import com.ayllusinchi.upeu.entidades.RespuestaEncuesta;
import java.util.List;

/**
 *
 * @author marco
 */
public interface RespuestaEncuestaService {
    
    public List<RespuestaEncuesta> findAll();
    public RespuestaEncuesta findById(Long id);
    public RespuestaEncuesta save (RespuestaEncuesta respuestaEncuesta);
    public void delete(RespuestaEncuesta respuestaEncuesta);
    public void deleteById(Long id);
    
    
}
