
package CONSALV.SQLCargo.infraestruture.controller;

import CONSALV.SQLCargo.app.service.ExpedienteService;
import CONSALV.SQLCargo.app.service.PartidaService;
import CONSALV.SQLCargo.app.service.ReciboService;
import CONSALV.SQLCargo.app.service.SolicitanteService;
import CONSALV.SQLCargo.infraestruture.entity.expediente;
import CONSALV.SQLCargo.infraestruture.entity.partida;
import CONSALV.SQLCargo.infraestruture.entity.recibo;
import java.util.List;
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
    private final ReciboService rs; 
    
    private final Logger log = LoggerFactory.getLogger(CargoController.class);    

    public CargoController(SolicitanteService ss, PartidaService ps, ExpedienteService es, ReciboService rs ) {
        this.ss = ss;
        this.ps = ps;
        this.es = es;
        this.rs = rs; 
    }

 @GetMapping("/add-cargo")
    public String vista() {
        return "/cargo/cargo"; // Asegúrate de que esta vista esté correctamente configurada
    }
    
  @PostMapping("/buscarPorNombreCompleto")
    public String buscarPorNombreCompleto(@RequestParam("nombre") String nombre,
                                          @RequestParam("apellido") String apellido,
                                          @RequestParam("apellido2") String apellido2,
                                          Model model) {
        if (nombre.isEmpty() || apellido.isEmpty() || apellido2.isEmpty()) {
            model.addAttribute("error", "Por favor, complete todos los campos.");
        } else {
            List<expediente> expedientes = es.findBySolicitanteNombreAndSolicitanteApellidoAndSolicitanteApellido2(nombre, apellido, apellido2);
            model.addAttribute("expedientes", expedientes.isEmpty() ? null : expedientes);
            model.addAttribute("mensaje", expedientes.isEmpty() ? "No se encontraron resultados." : null);
        }
        return "/cargo/cargo";
    }

 
    @PostMapping("/buscarPorApellido")
    public String buscarPorApellido(@RequestParam("apellido") String apellido, Model model) {
        if (apellido.isEmpty()) {
            model.addAttribute("error", "Por favor, ingrese un apellido.");
        } else {
            List<expediente> expedientes = es.findBySolicitanteApellido(apellido);
            model.addAttribute("expedientes", expedientes.isEmpty() ? null : expedientes);
            model.addAttribute("mensaje", expedientes.isEmpty() ? "No se encontraron resultados." : null);
        }
        return "/cargo/cargo";
    }


    @PostMapping("/buscarPorNombre")
    public String buscarPorNombre(@RequestParam("nombre") String nombre, Model model) {
        if (nombre.isEmpty()) {
            model.addAttribute("error", "Por favor, ingrese un nombre.");
        } else {
            List<expediente> expedientes = es.findBySolicitanteNombre(nombre);
            model.addAttribute("expedientes", expedientes.isEmpty() ? null : expedientes);
            model.addAttribute("mensaje", expedientes.isEmpty() ? "No se encontraron resultados." : null);
        }
        return "/cargo/cargo";
    }

   
    @PostMapping("/buscarPorNombreYApellido")
    public String buscarPorNombreYApellido(@RequestParam("nombre") String nombre,
                                           @RequestParam("apellido") String apellido,
                                           Model model) {
        if (nombre.isEmpty() || apellido.isEmpty()) {
            model.addAttribute("error", "Por favor, complete ambos campos.");
        } else {
            List<expediente> expedientes = es.findBySolicitanteNombreAndSolicitanteApellido(nombre, apellido);
            model.addAttribute("expedientes", expedientes.isEmpty() ? null : expedientes);
            model.addAttribute("mensaje", expedientes.isEmpty() ? "No se encontraron resultados." : null);
        }
        return "/cargo/cargo";
    }
 
    @PostMapping("/buscarPorExpediente")
    public String buscarPorExpediente(@RequestParam("numeroEx") String numeroEx, Model model) {
        if (numeroEx.isEmpty()) {
            model.addAttribute("error", "Por favor, ingrese un número de expediente.");
        } else {
            List<expediente> expedientes = es.buscarPorExpediente(numeroEx);
            model.addAttribute("expedientes", expedientes.isEmpty() ? null : expedientes);
            model.addAttribute("mensaje", expedientes.isEmpty() ? "No se encontraron resultados." : null);
        }
        return "/cargo/cargo";
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
    if (sector.isEmpty() || manzana.isEmpty() || lote.isEmpty()) {
        model.addAttribute("error", "Por favor, complete todos los campos.");
        return "/cargo/partida";
    }
    
// Realiza la búsqueda con los parámetros
    Iterable<partida> partidas = ps.buscarPartida(manzana, sector, lote);
    model.addAttribute("partidas", partidas);
    return "/cargo/partida";
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
   @PostMapping("/buscar-recibo-nombre")
public String buscarRecibos(@RequestParam("datosPersonales") String datosPersonales,
                                 Model model) {
    List<recibo> recibos = rs.findByDatosPersonalesContainingIgnoreCase(datosPersonales);
    model.addAttribute("recibos", recibos); // Asegúrate de que el nombre sea 'expedientes'
      if (datosPersonales.isEmpty() ) {
    model.addAttribute("error", "Por favor, complete todos los campos.");}
    return "/cargo/recibo"; // Asegúrate de que esta es la vista correcta
}
@PostMapping("/buscar-por-numero")
    public String buscarPorRecibo(@RequestParam("recibo") String numeroR, Model model) {
        if (numeroR.isEmpty()) {
            model.addAttribute("error", "Por favor, introduzca un número de partida.");
            return "/cargo/partida";
        }

        List<recibo> recibos = rs.findByNumeroRContainingIgnoreCase(numeroR);
        if (recibos.isEmpty()) {
            model.addAttribute("error", "No se encontraron partidas con el número especificado.");
        }

        model.addAttribute("recibos", recibos);
        return "/cargo/recibo";
    }
    
}