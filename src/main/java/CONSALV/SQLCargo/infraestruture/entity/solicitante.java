
package CONSALV.SQLCargo.infraestruture.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "solicitante")
public class solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "apellido", length = 20)
    private String apellido;
    @Column(name = "apellido2", length = 20)
    private String apellido2;
    @Column(name = "dni", length = 8)
    private String dni;
    @Column(name = "celular", length = 11)
    private String celular;
    @Column(name = "solicito", length = 100)
    private String solicito;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getSolicito() {
        return solicito;
    }

    public void setSolicito(String solicito) {
        this.solicito = solicito;
    }
    
    
}
