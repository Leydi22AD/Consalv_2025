package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ReciboCrudRepository extends CrudRepository<recibo, Integer> {
  // Método para buscar por fragmentos de datosPersonales (sin distinguir entre mayúsculas y minúsculas)
    List<recibo> findByDatosPersonalesContainingIgnoreCase(String datosPersonales);

    // Método para buscar por fragmentos del número de recibo
    List<recibo> findByNumeroRContainingIgnoreCase(String numeroR);

}
