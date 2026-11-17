/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.caue.clinicaSaepAPI.database.repository;

import br.eti.caue.clinicaSaepAPI.database.model.PetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface PetsRepository extends JpaRepository<PetsEntity, Long> {
    // Uma interface diz o que tem que ser feito (cardapio), mas sem fazer, nesse caso só libera opções como .save, .findById...    
}
