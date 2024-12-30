/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONSALV.SQLCargo.infraestruture.configuration;

import CONSALV.SQLCargo.app.repository.ExpedienteRepository;
import CONSALV.SQLCargo.app.repository.PartidaRepository;
import CONSALV.SQLCargo.app.repository.RespuestaRepository; 
import CONSALV.SQLCargo.app.repository.SolicitanteRepository;
import CONSALV.SQLCargo.app.service.ExpedienteService;
import CONSALV.SQLCargo.app.service.PartidaService;
import CONSALV.SQLCargo.app.service.RespuestaService; 
import CONSALV.SQLCargo.app.service.SolicitanteService;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfiguration {
  @Bean
public SolicitanteService solicitanteService(SolicitanteRepository repository){
    return new SolicitanteService(repository);
}
 
@Bean
public PartidaService partidaService(PartidaRepository pr){
    return new PartidaService(pr);
}
  @Bean
public ExpedienteService expedienteService(ExpedienteRepository er ){
    return new ExpedienteService(er);
}
  @Bean
public RespuestaService respuestaService(RespuestaRepository rr){
    return new RespuestaService(rr);
} 
 
}
