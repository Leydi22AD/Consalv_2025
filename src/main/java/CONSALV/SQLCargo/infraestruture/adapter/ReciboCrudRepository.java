package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ReciboCrudRepository extends CrudRepository<recibo, Integer> {

    List<recibo> findByDatosPersonales(String datosPersonales);

    List<recibo> findByNumeroR(String numeroR);
}
