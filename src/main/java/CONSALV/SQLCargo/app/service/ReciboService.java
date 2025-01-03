package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.ReciboRepository;
import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;


public class ReciboService {
    private final ReciboRepository rre;

    public ReciboService(ReciboRepository rre) {
        this.rre = rre;
    }
    
    public List<recibo> findBySolicitanteNombreAndSolicitanteApellido(String nombre, String apellido){
          return rre.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);
      }
  public List<recibo> buscarPorRecibo(String numeroR){
      return rre.buscarPorRecibo(numeroR);
        } 
}
