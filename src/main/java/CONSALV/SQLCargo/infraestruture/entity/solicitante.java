
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
}
