package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.ReciboRepository;
import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;


public class ReciboService {
    private final ReciboRepository rre;

    public ReciboService(ReciboRepository rre) {
        this.rre = rre;
    }
    
 
          // Método para buscar por fragmentos de datosPersonales (sin distinguir entre mayúsculas y minúsculas)
  public List<recibo> findByDatosPersonalesContainingIgnoreCase(String datosPersonales){
          return rre.findByDatosPersonalesContainingIgnoreCase(datosPersonales);
      }
  public   List<recibo> findByNumeroRContainingIgnoreCase(String numeroR){
      return rre.findByNumeroRContainingIgnoreCase(numeroR);
        } 
}
