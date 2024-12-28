
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.RespuestaRepository;
import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.respuesta;
import org.springframework.stereotype.Repository;
@Repository
public class RespuestaRepositoryImpl implements RespuestaRepository{
public final RespuestaCrudRepository rcr;

    public RespuestaRepositoryImpl(RespuestaCrudRepository rcr) {
        this.rcr = rcr;
    }

    @Override
    public expediente getRespuestaByExpediente(expediente expediente) {
    return rcr.findByExpediente(expediente);
    }

    @Override
    public respuesta getRespuestaById(int idR) {
return rcr.findById(idR).get();
        }
    
}
