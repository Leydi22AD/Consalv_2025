package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.ExpedienteRepository;
import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public class ExpedienteRepositoryImpl implements ExpedienteRepository{
public final ExpedienteCrudRepository ecr;

    public ExpedienteRepositoryImpl(ExpedienteCrudRepository ecr) {
        this.ecr = ecr;
    }

    @Override
    public List<expediente> findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(String nombre, String apellido, String apellido2){
        return  ecr.findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(nombre, apellido, apellido2);
    }
 @Override
    public List<expediente> findBySolicitanteApellido(String apellido) {
        return ecr.findBySolicitanteApellido(apellido); 
    } 

    @Override
    public List<expediente> findBySolicitanteNombre(String nombre) {
 return ecr.findBySolicitanteNombre(nombre);
    }

    @Override
    public List<expediente> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido) {
 return ecr.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);   }

    @Override
    public List<expediente> buscarPorExpediente(String numeroEx) {
 return ecr.findByNumeroEx(numeroEx);    }

   
    
}
