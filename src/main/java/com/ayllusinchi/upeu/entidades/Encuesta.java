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
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Encuesta")
public class Encuesta {
    
    @Id
    @Column(name = "en_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enId;
    
    @Column(name = "en_grupo")
    private char enGrupo;
    
    @Column(name = "en_pregunta")
    private String enPregunta;
    
    @Column(name = "en_ordenpregunta")
    private int enOrdenpregunta;
}