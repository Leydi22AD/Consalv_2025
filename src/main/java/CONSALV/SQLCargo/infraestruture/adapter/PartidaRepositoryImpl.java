/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.PartidaRepository;
import CONSALV.SQLCargo.infraestruture.entity.partida; 
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CONSALV
 */
@Repository
public class PartidaRepositoryImpl implements PartidaRepository{
public final PartidaCrudRepository pcr;

    public PartidaRepositoryImpl(PartidaCrudRepository pcr) {
        this.pcr = pcr;
    }
 

    @Override
    public Iterable<partida> buscarPartida(String manzana, String sector, String lote){
        return pcr.findByManzanaAndSectorAndLote(manzana, sector, lote);
    }
@Override
    public List<partida> buscarPorPartida(String partida) {
    return pcr.findByPartida(partida);
    }
}