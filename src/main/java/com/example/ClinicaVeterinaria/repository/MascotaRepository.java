/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ClinicaVeterinaria.repository;

import com.example.ClinicaVeterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author César
 */

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    
}
