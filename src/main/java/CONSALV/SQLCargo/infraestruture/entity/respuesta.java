 
package CONSALV.SQLCargo.infraestruture.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "respuesta")
public class respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private Integer idR;

    @ManyToOne
    @JoinColumn(name = "idEx", referencedColumnName = "idEx", nullable = false)
    private expediente expediente;

    @Column(name = "carta", length = 100)
    private String carta;
    @Column(name = "rutaC", length = 100)
    private String rutaC;

    // Getters and Setters
    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(expediente expediente) {
        this.expediente = expediente;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public String getRutaC() {
        return rutaC;
    }

    public void setRutaC(String rutaC) {
        this.rutaC = rutaC;
    }
}
