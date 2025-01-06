
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;

public interface ReciboRepository {
  

  List<recibo> findByDatosPersonales(String datosPersonales);
  public List<recibo> buscarPorRecibo(String numeroR);  
}
