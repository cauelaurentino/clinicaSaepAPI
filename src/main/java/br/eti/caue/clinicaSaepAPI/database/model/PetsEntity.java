/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.caue.clinicaSaepAPI.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author digma
 */
@Entity
@Table(name = "tb_pets")
public class PetsEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column (nullable = false, length = 100)
    private String nomePet;
    
    private int peso;
    
    @ManyToOne
    @JoinColumn(name = "idTutor", nullable = false)
    private TutoresEntity tutor;
}
