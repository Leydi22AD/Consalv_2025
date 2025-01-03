
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
    public List<recibo> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido) {
        return  rcr.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);
    }

    @Override
    public List<recibo> buscarPorRecibo(String numeroR) {
        return rcr.findByNumeroR(numeroR);
    }
   
}
