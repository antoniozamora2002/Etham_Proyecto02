/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ayllusinchi.upeu.Repository;

import com.ayllusinchi.upeu.entidades.RespuestaEncuesta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marco
 */
@Repository
public interface RespuestaEncuestaRepository extends CrudRepository<RespuestaEncuesta, Long>{
    
}
