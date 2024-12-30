/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONSALV.SQLCargo.app.repository;

import CONSALV.SQLCargo.infraestruture.entity.partida; 
import java.util.List;

/**
 *
 * @author CONSALV
 */
public interface PartidaRepository {
  Iterable<partida>buscarPartida(String manzana, String sector, String lote);
  public List<partida> buscarPorPartida(String partida);
}
