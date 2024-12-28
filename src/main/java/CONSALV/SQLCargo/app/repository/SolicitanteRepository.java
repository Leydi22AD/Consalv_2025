
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.solicitante;


public interface SolicitanteRepository {
     public solicitante getExpedienteByNombreAndApellido(String nombre,String apellido);
}
