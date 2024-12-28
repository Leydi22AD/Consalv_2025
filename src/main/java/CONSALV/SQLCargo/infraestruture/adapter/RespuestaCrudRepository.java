/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.respuesta;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CONSALV
 */
public interface RespuestaCrudRepository extends CrudRepository<respuesta, Integer>{
    public expediente findByExpediente(expediente expediente);
}
