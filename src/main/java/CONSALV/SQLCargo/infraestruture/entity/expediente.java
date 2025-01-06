
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

    @Column(name = "numeroEx", length = 19)
    private String numeroEx;
    @Column(name = "rutaEx", length = 100)
    private String rutaEx;
    @Column(name = "observaciones", length = 100)
    private String observaciones;

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

    public String getRutaEx() {
        return rutaEx;
    }

    public void setRutaEx(String rutaEx) {
        this.rutaEx = rutaEx;
    }

    public respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
