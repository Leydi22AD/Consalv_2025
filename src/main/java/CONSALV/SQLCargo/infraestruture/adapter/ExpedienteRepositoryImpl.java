/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.ExpedienteRepository;
import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CONSALV
 */
@Repository
public class ExpedienteRepositoryImpl implements ExpedienteRepository{
public final ExpedienteCrudRepository ecr;

    public ExpedienteRepositoryImpl(ExpedienteCrudRepository ecr) {
        this.ecr = ecr;
    }

    @Override
    public List<expediente> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido) {
        return  ecr.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);
    }

    
}
