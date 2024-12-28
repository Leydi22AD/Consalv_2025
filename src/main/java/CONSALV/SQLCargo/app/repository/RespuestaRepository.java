
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.respuesta;

public interface RespuestaRepository {
  public expediente getRespuestaByExpediente(expediente expediente);

    public respuesta getRespuestaById(int idR);
}
