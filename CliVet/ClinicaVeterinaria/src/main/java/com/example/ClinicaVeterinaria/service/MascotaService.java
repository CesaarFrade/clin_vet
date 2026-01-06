/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ClinicaVeterinaria.service;

import com.example.ClinicaVeterinaria.dto.MascotaDuenoDTO;
import com.example.ClinicaVeterinaria.model.Mascota;
import com.example.ClinicaVeterinaria.repository.MascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author César
 */

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    MascotaRepository mascRepo;
    
    @Override
    public void saveMascota(Mascota mascota) {
        mascRepo.save(mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        saveMascota(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        Mascota mascota = getMascota(id_mascota);
        mascRepo.delete(mascota);
    }

    @Override
    public Mascota getMascota(Long id_mascota) {
        return mascRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascRepo.findAll();
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> mascotas = getMascotas();
        List<Mascota> caniches = new ArrayList<>();
        String especie = "";
        String raza = "";
        for(Mascota mascota : mascotas){
            especie = mascota.getEspecie();
            if(especie.equals("perro") || especie.equals("Perro") || especie.equals("PERRO")){
                raza = mascota.getRaza();
                if(raza.equals("caniche") || raza.equals("Caniche") || raza.equals("CANICHE")){
                    caniches.add(mascota);
                }
            }
        }
        return caniches;
    }    
    
    @Override
    public List<MascotaDuenoDTO> getMascoDuenios() {
        
        List<Mascota> listaMascotas = this.getMascotas();
        List<MascotaDuenoDTO> listaMascoDuenio = new ArrayList<MascotaDuenoDTO>();
        MascotaDuenoDTO masco_duenio = new MascotaDuenoDTO();
        
        for (Mascota masco : listaMascotas) {
            
            System.out.println(masco.getNombre());
            masco_duenio.setNombre_dueno(masco.getDueno().getNombre());
            masco_duenio.setNombre_mascota(masco.getNombre());
            masco_duenio.setApellido_dueno(masco.getDueno().getApellido());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());
            
            listaMascoDuenio.add(masco_duenio);
            masco_duenio = new MascotaDuenoDTO();//reseteo
        }
        return listaMascoDuenio;
    }
}
