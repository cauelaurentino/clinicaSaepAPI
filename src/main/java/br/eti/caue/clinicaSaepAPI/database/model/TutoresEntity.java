/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.caue.clinicaSaepAPI.database.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author digma
 */

@Entity
@Table(name = "tb_tutores")

// ANOTAÇÕES LOMBOK:
@Getter // Cria todos os getNome(), getRaca(), etc.
@Setter // Cria todos os setNome(), setRaca(), etc.
@NoArgsConstructor // Obriga o Lombok a criar um construtor vazio (O Hibernate EXIGE isso)
@AllArgsConstructor // Cria um construtor com todos os campos (útil para testes)

public class TutoresEntity {
    @Id // Identificando coluna de ID da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Determinando a geração automatica desse ID
    private long idTutor;
    
    @Column (nullable = false, length = 100) // Não pode estar vazia e 100 caracteres maximos
    private String nomeTutor;
    
    @Column (nullable = false)
    private int cpfTutor;
    
    @Column (nullable = false)
    private int telefoneTutor;
    
    @OneToMany(mappedBy = "tutorPet", cascade = CascadeType.ALL) // Referenciando a coluna da tabela de pets e colocando o efeito cascata, se um tutor é apagado, todos seus pets tb são
    @JsonIgnore // Evitar looping ????????
    private List<PetsEntity> pets;
}

