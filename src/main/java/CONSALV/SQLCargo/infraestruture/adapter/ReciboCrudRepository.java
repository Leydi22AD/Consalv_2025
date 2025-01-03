package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ReciboCrudRepository extends CrudRepository<recibo, Integer> {

    List<recibo> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido);

    List<recibo> findByNumeroR(String numeroR);
}
