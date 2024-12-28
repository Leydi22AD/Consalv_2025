/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.SolicitanteRepository;
import CONSALV.SQLCargo.infraestruture.entity.solicitante;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CONSALV
 */
@Repository
public class SolicitanteRepositoryImpl implements SolicitanteRepository{
public final SolicitanteCrudRepository scr;

    public SolicitanteRepositoryImpl(SolicitanteCrudRepository scr) {
        this.scr = scr;
    }

    @Override
    public solicitante getExpedienteByNombreAndApellido(String nombre, String apellido) {
       return scr.findByNombreAndApellido(nombre, apellido);
    }
    
}
