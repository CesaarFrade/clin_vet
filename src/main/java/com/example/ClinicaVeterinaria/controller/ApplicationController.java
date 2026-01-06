/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ClinicaVeterinaria.controller;

import com.example.ClinicaVeterinaria.dto.MascotaDuenoDTO;
import com.example.ClinicaVeterinaria.model.Dueno;
import com.example.ClinicaVeterinaria.model.Mascota;
import com.example.ClinicaVeterinaria.service.DuenoService;
import com.example.ClinicaVeterinaria.service.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author César
 */

@RestController
public class ApplicationController {
    @Autowired
    DuenoService duenoServ;
    @Autowired
    MascotaService mascServ;
    
    
    @PostMapping("/duenos/crear")
    public void saveDueno(@RequestBody Dueno dueno){
        duenoServ.saveDueno(dueno);
    }
    
    @PutMapping("/duenos/editar")
    public void editDueno(@RequestBody Dueno dueno){
        duenoServ.editDueno(dueno);
    }
    
    @GetMapping("/duenos/datos")
    public List<Dueno> getDuenos(){
        return duenoServ.getDuenos();
    }
    
    @GetMapping("/duenos/datos/{id_dueno}")
    public Dueno getDueno(@PathVariable Long id_dueno){
        return duenoServ.getDueno(id_dueno);
    }
    
    @DeleteMapping("/duenos/borrar/{id_dueno}")
    public void deleteDueno(@PathVariable Long id_dueno){
        duenoServ.deleteDueno(id_dueno);
    }
    
    @PostMapping("/mascotas/crear")
    public void saveMascota(@RequestBody Mascota mascota){
        mascServ.saveMascota(mascota);
    }
    
    @PutMapping("/mascotas/editar")
    public void editMascota(@RequestBody Mascota mascota){
        mascServ.editMascota(mascota);
    }
    
    @GetMapping("/mascotas/datos")
    public List<Mascota> getMascotas(){
        return mascServ.getMascotas();
    }
    
    @GetMapping("/mascotas/datos/{id_mascota}")
    public Mascota getMascota(@PathVariable Long id_mascota){
        return mascServ.getMascota(id_mascota);
    }
    
    @DeleteMapping("/mascotas/borrar/{id_mascota}")
    public void deleteMascotas(@PathVariable Long id_mascota){
        mascServ.deleteMascota(id_mascota);
    }
    
    @GetMapping("/mascotas/caniches")
    public List<Mascota> getCaniches(){
        return mascServ.getCaniches();
    }
    
    @GetMapping("/dto")
    public List<MascotaDuenoDTO> getDTO(){
       return mascServ.getMascoDuenios();   
    }
}
