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

    
}
