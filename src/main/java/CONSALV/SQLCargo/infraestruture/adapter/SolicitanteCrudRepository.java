/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.solicitante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CONSALV
 */
public interface SolicitanteCrudRepository extends CrudRepository<solicitante, Integer>{
solicitante findByNombreAndApellido(String nombre, String apellido);
}
