package CONSALV.SQLCargo.infraestruture.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recibo")
public class recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private Integer idR;
    @Column(name = "fecha", length = 15)
    private String fecha;
 @Column(name = "datosPersonales", length = 160)
    private String datosPersonales;
    @Column(name = "telefono", length = 33)
    private String telefono;
    @Column(name = "asunto", length = 180)
    private String asunto;

    @Column(name = "numeroR", length = 10)
    private String numeroR;

    @Column(name = "rutaR", length = 100)
    private String rutaR;
    @Column(name = "importe", length = 10)
    private String importe;
    @Column(name = "saldo", length = 10)
    private String saldo;
    @Column(name = "observaciones", length = 100)
    private String observaciones;

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  public String getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(String datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(String numeroR) {
        this.numeroR = numeroR;
    }

    public String getRutaR() {
        return rutaR;
    }

    public void setRutaR(String rutaR) {
        this.rutaR = rutaR;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
