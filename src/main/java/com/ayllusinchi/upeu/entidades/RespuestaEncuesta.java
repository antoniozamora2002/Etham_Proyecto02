/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayllusinchi.upeu.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author marco
 */
 @Entity
 @Data
 @Table(name = "resp_enc")
public class RespuestaEncuesta {
    
     @Id
     @Column(name="respenc_id")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long respenId;
     
     @ManyToOne
     @JoinColumn(name = "peta_id")
     private PersonaTaller personaTaller;
     
     @ManyToOne
     @JoinColumn(name="en_id")
     private Encuesta encuesta;
     
     @Column(name="Respuesta")
     private String Respuesta;
     
}
