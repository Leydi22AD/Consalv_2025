 
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

    @Column(name = "carta", length = 15)
    private String carta;

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
}
