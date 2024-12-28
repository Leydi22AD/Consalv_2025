package CONSALV.SQLCargo.app.service;

import CONSALV.SQLCargo.app.repository.PartidaRepository;
import CONSALV.SQLCargo.infraestruture.entity.partida;
import CONSALV.SQLCargo.infraestruture.entity.sectores;
import java.util.List;

 
public class PartidaService {
   public final PartidaRepository pr;

    public PartidaService(PartidaRepository pr) {
        this.pr = pr;
    }
   
      public List<partida> buscarPartida(String manzana, String sector, String lote) {
        // Asegúrate de que los parámetros sean correctamente pasados y que la búsqueda esté bien estructurada
        return pr.findByManzanaAndSectorAndLote(manzana, sector, lote);
    }
      public List<partida> buscarPorPartida(String partida) {
    return pr.buscarPorPartida(partida);
      }
}
