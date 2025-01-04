package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ExpedienteCrudRepository extends CrudRepository<expediente, Integer>{
    List<expediente> findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(String nombre, String apellido, String apellido2);
}
