
package CONSALV.SQLCargo.infraestruture.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "expediente")
public class expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEx")
    private Integer idEx;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private solicitante solicitante;

    @Column(name = "numeroEx", length = 9)
    private String numeroEx;

    @ManyToOne
    @JoinColumn(name = "idR", referencedColumnName = "idR", nullable = false)
    private respuesta respuesta;

    // Getters and Setters
    public Integer getIdEx() {
        return idEx;
    }

    public void setIdEx(Integer idEx) {
        this.idEx = idEx;
    }

    public solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public String getNumeroEx() {
        return numeroEx;
    }

    public void setNumeroEx(String numeroEx) {
        this.numeroEx = numeroEx;
    }

    public respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(respuesta respuesta) {
        this.respuesta = respuesta;
    }
}
