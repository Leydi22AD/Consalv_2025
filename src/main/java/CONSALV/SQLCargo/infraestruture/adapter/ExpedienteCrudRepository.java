/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CONSALV
 */
public interface ExpedienteCrudRepository extends CrudRepository<expediente, Integer>{
    List<expediente> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido);
}
