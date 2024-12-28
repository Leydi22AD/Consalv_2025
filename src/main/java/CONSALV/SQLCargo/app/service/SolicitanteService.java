
package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.SolicitanteRepository;
import CONSALV.SQLCargo.infraestruture.entity.solicitante;


public class SolicitanteService {
    public final SolicitanteRepository repository;

    public SolicitanteService(SolicitanteRepository repository) {
        this.repository = repository;
    }
         public solicitante getExpedienteByNombreAndApellido(String nombre,String apellido){
             return repository.getExpedienteByNombreAndApellido(nombre, apellido);
         }
}
