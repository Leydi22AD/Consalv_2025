 
package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.RespuestaRepository;
import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.respuesta;
 
public class RespuestaService {
    public final RespuestaRepository rr;

    public RespuestaService(RespuestaRepository rr) {
        this.rr = rr;
    }
    
     public expediente getRespuestaByExpediente(expediente expediente){
        return rr.getRespuestaByExpediente(expediente);
    }
     public respuesta getRespuestaById(int idR){
         return rr.getRespuestaById(idR);
     }
}
