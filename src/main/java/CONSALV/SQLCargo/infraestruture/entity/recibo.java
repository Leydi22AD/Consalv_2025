package CONSALV.SQLCargo.infraestruture.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "recibo")
public class recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private Integer idR;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private solicitante solicitante;

    @Column(name = "numeroR", length = 9)
    private String numeroR;

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public String getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(String numeroR) {
        this.numeroR = numeroR;
    }

}
