package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.expediente; 
import java.util.List;


public interface ExpedienteRepository {
  List<expediente> findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(String nombre, String apellido, String apellido2);
   List<expediente> findBySolicitanteApellido(String apellido);
  List<expediente> findBySolicitanteNombre(String nombre);
  List<expediente> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido);
  List<expediente> buscarPorExpediente(String numeroEx);
}
