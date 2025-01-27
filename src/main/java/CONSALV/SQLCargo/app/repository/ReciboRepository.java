
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;

public interface ReciboRepository {
  

  // Método para buscar por fragmentos de datosPersonales (sin distinguir entre mayúsculas y minúsculas)
    List<recibo> findByDatosPersonalesContainingIgnoreCase(String datosPersonales);

    // Método para buscar por fragmentos del número de recibo
    List<recibo> findByNumeroRContainingIgnoreCase(String numeroR);
}
