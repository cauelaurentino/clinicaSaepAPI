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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author digma
 */
@Entity
@Table(name = "tb_pets")

// ANOTAÇÕES LOMBOK:
@Getter // Cria todos os getNome(), getRaca(), etc.
@Setter // Cria todos os setNome(), setRaca(), etc.
@NoArgsConstructor // Obriga o Lombok a criar um construtor vazio (O Hibernate EXIGE isso)
@AllArgsConstructor // Cria um construtor com todos os campos (útil para testes)

public class PetsEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPet;
    
    @Column (nullable = false, length = 100)
    private String nomePet;
    
    private int raca;
    
    @ManyToOne // Muitos pets para um dono
    @JoinColumn(name = "idTutor", nullable = false) // Foreign Key, puxando o id do tutor
    private TutoresEntity tutorPet; // puxando o id na coluna tutor, já puxo todos os dados da classe TutoresEntity
}
