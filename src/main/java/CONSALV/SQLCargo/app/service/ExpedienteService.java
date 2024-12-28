/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.ExpedienteRepository;
import CONSALV.SQLCargo.app.repository.RespuestaRepository;
import CONSALV.SQLCargo.infraestruture.entity.expediente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpedienteService {
    public final ExpedienteRepository er;
@Autowired
    public ExpedienteService(ExpedienteRepository er ) {
        this.er = er;
     
    }
  
    public List<expediente> buscarExpedientes(String nombre, String apellido) {
        return er.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);
    }




}
