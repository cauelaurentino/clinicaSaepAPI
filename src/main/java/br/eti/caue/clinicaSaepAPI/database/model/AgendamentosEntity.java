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
import java.time.LocalDateTime;

/**
 *
 * @author digma
 */

@Entity
@Table (name = "tb_agendamentos")
public class AgendamentosEntity {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgendamentos;
    
    @Column(nullable = false)
    private LocalDateTime datahora;
    
    @Column(nullable = false)
    private String servico;
    
    private Double valor;
    
    @ManyToOne
    @JoinColumn(name = "idPet", nullable = false) // FK referenciando a tabela de pets
    private PetsEntity pet; // Guardando todas as inoformações dos pets nessa var (Inclusive o tutor)
}
