package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;


public interface ExpedienteRepository {
  List<expediente> findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(String nombre, String apellido, String apellido2);

}
