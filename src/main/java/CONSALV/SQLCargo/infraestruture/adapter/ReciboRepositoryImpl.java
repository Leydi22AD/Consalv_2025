
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.ReciboRepository;
import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ReciboRepositoryImpl implements ReciboRepository{
    private final ReciboCrudRepository rcr;

    public ReciboRepositoryImpl(ReciboCrudRepository rcr) {
        this.rcr = rcr;
    }
    @Override
    public List<recibo> findByDatosPersonalesContainingIgnoreCase(String datosPersonales) {
       return  rcr.findByDatosPersonalesContainingIgnoreCase(datosPersonales);
    }

    @Override
    public List<recibo> findByNumeroRContainingIgnoreCase(String numeroR) {
      return rcr.findByNumeroRContainingIgnoreCase(numeroR);
    }

   
}
