
package CONSALV.SQLCargo.infraestruture.controller;

import CONSALV.SQLCargo.app.repository.ExpedienteRepository;
import CONSALV.SQLCargo.app.service.ExpedienteService;
import CONSALV.SQLCargo.app.service.PartidaService;
import CONSALV.SQLCargo.app.service.RespuestaService; 
import CONSALV.SQLCargo.app.service.SolicitanteService;
import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.partida; 
import CONSALV.SQLCargo.infraestruture.entity.solicitante;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/cargo")
public class CargoController {
 

    private final SolicitanteService ss;
    private final PartidaService ps;
    private final ExpedienteService es;
    private final RespuestaService rs; 
    private final Logger log = LoggerFactory.getLogger(CargoController.class);    

    public CargoController(SolicitanteService ss, PartidaService ps, ExpedienteService es, RespuestaService rs ) {
        this.ss = ss;
        this.ps = ps;
        this.es = es;
        this.rs = rs;
        
    }

 @GetMapping("/add-cargo")
    public String vista() {
        return "/cargo/cargo"; // Asegúrate de que esta vista esté correctamente configurada
    }
    
    @PostMapping("/buscar")
public String buscarExpedientes(@RequestParam("nombre") String nombre,
                                 @RequestParam("apellido") String apellido,
                                 Model model) {
    List<expediente> expedientes = es.buscarExpedientes(nombre, apellido);
    model.addAttribute("expedientes", expedientes); // Asegúrate de que el nombre sea 'expedientes'
      if (apellido.isEmpty() || nombre.isEmpty()) {
    model.addAttribute("error", "Por favor, complete todos los campos.");}
    return "/cargo/cargo"; // Asegúrate de que esta es la vista correcta
}

    
    @GetMapping("/add-partida")
    public String partida(Model model) { 
        return "/cargo/partida";
    }
@PostMapping("/buscar-partida")
public String buscarPartida(@RequestParam("sector") String sector,
                             @RequestParam("manzana") String manzana,
                             @RequestParam("lote") String lote,
                             Model model) {
    System.out.println("Sector: " + sector);  // Verifica que esté llegando el sector
    System.out.println("Manzana: " + manzana); // Verifica que esté llegando la manzana
    System.out.println("Lote: " + lote);      // Verifica que esté llegando el lote

    if (sector.isEmpty() ||manzana.isEmpty() || lote.isEmpty()) {
        model.addAttribute("error", "Por favor, complete todos los campos.");
        return "/cargo/partida";
    }

    Iterable<partida> partidas = ps.buscarPartida(sector, manzana, lote);
    model.addAttribute("partidas", partidas);
    return "/cargo/partida";  // Regresa a la misma vista con los resultados
}


    @PostMapping("/buscar-por-partida")
    public String buscarPorPartida(@RequestParam("partida") String partida, Model model) {
        if (partida.isEmpty()) {
            model.addAttribute("error", "Por favor, introduzca un número de partida.");
            return "/cargo/partida";
        }

        List<partida> partidas = ps.buscarPorPartida(partida);
        if (partidas.isEmpty()) {
            model.addAttribute("error", "No se encontraron partidas con el número especificado.");
        }

        model.addAttribute("partidas", partidas);
        return "/cargo/partida";
    }

 @GetMapping("/add-recibo")
    public String recibo(){
        return "/cargo/recibo";
    }
    
}
