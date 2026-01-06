/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ClinicaVeterinaria.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author César
 */

@Entity
@Getter @Setter
public class Dueno {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_dueno;
    private String dni;
    private String nombre;
    private String apellido;
    private String movil;
    @OneToOne
    Mascota mascota;

    public Dueno() {
    }

    public Dueno(Long id_dueno, String dni, String nombre, String apellido, String movil, Mascota mascota) {
        this.id_dueno = id_dueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.movil = movil;
        this.mascota = mascota;
    }
}
