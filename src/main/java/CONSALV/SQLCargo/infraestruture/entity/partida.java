
package CONSALV.SQLCargo.infraestruture.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "partida")
public class partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPar")
    private Integer idPar;

 @Column(name = "manzana", length = 3)
    private String manzana;
    
    @Column(name = "lote", length = 3)
    private String lote; 

 @Column(name = "sector", length = 255)
    private String sector;

    @Column(name = "partida", length = 10)
    private String partida;
     
    @Column(name = "ruta", length = 255)
    private String ruta;  // Columna para almacenar la ruta del PDF

    // Getters and Setters
    public Integer getIdPar() { 
        return idPar;
    }

    public void setIdPar(Integer idPar) {
        this.idPar = idPar;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }


  

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }



    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

     
}
