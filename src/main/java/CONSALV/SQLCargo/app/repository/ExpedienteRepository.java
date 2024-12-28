/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;


public interface ExpedienteRepository {
  List<expediente> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido);

}
