/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.SectoresRepository;
import CONSALV.SQLCargo.infraestruture.entity.sectores;

/**
 *
 * @author CONSALV
 */

public class SectoresService {
   private final SectoresRepository sr;

    public SectoresService(SectoresRepository sr) {
        this.sr = sr;
    }
   
    public Iterable<sectores> getSectores(){
     return sr.getSectores();
    }  
}
