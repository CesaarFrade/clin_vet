/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ClinicaVeterinaria.service;

import com.example.ClinicaVeterinaria.dto.MascotaDuenoDTO;
import com.example.ClinicaVeterinaria.model.Mascota;
import java.util.List;

/**
 *
 * @author César
 */
public interface IMascotaService {
    public void saveMascota(Mascota mascota);
    public void editMascota(Mascota mascota);
    public void deleteMascota(Long id_mascota);
    public Mascota getMascota(Long id_mascota);
    public List<Mascota> getMascotas();
    public List<Mascota> getCaniches();
    public List<MascotaDuenoDTO> getMascoDuenios();
}
