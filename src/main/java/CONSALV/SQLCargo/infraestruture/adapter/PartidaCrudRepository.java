/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.infraestruture.entity.partida;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CONSALV
 */
public interface PartidaCrudRepository extends CrudRepository<partida, Integer>{
    Iterable<partida> findBySectorAndManzanaAndLote(String sector,String manzana,String lote);

    // También puedes agregar otros métodos si necesitas búsquedas adicionales
    List<partida> findBySector(String  sector);
    List<partida> findBySectorAndManzana(String  sector, String manzana);
    List<partida> findBySectorAndLote(String  sector, String lote);
  List<partida> findByPartida(String partida);
}
