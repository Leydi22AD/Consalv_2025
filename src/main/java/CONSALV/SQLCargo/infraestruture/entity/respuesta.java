 
package CONSALV.SQLCargo.infraestruture.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "respuesta")
public class respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private Integer idR;

    @Column(name = "resolucion", length = 50)
    private String resolucion;
    @Column(name = "rutaRe", length = 100)
    private String rutaRe;

   
    @Column(name = "constancia", length = 50)
    private String constancia;
    @Column(name = "rutaC", length = 100)
    private String rutaC;

   

    // Getters and Setters
    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getRutaRe() {
        return rutaRe;
    }

    public void setRutaRe(String rutaRe) {
        this.rutaRe = rutaRe;
    }

    public String getConstancia() {
        return constancia;
    }

    public void setConstancia(String constancia) {
        this.constancia = constancia;
    }

    public String getRutaC() {
        return rutaC;
    }

    public void setRutaC(String rutaC) {
        this.rutaC = rutaC;
    }

 
   
}
