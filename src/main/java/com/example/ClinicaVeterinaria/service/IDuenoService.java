/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ClinicaVeterinaria.service;

import com.example.ClinicaVeterinaria.model.Dueno;
import java.util.List;

/**
 *
 * @author César
 */
public interface IDuenoService {
    public void saveDueno(Dueno dueno);
    public void editDueno(Dueno dueno);
    public void deleteDueno(Long id_dueno);
    public Dueno getDueno(Long id_dueno);
    public List<Dueno> getDuenos();
}
