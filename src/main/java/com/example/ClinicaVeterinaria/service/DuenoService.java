/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ClinicaVeterinaria.service;

import com.example.ClinicaVeterinaria.model.Dueno;
import com.example.ClinicaVeterinaria.repository.DuenoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author César
 */

@Service
public class DuenoService implements IDuenoService{
    @Autowired
    private DuenoRepository duenoRepository;

    @Override
    public void saveDueno(Dueno dueno) {
        duenoRepository.save(dueno);
    }

    @Override
    public void editDueno(Dueno dueno) {
        saveDueno(dueno);
    }

    @Override
    public void deleteDueno(Long id_dueno) {
        Dueno dueno = getDueno(id_dueno);
        duenoRepository.delete(dueno);
    }

    @Override
    public Dueno getDueno(Long id_dueno) {
        return duenoRepository.findById(id_dueno).orElse(null);
    }

    @Override
    public List<Dueno> getDuenos() {
        return duenoRepository.findAll();
    }
    
    
}
