
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@Entity
@Table(name="users")
public class mu {
    @Id
    @GneratedValue(strategy= Generationtype.IDENTITY)
    private long id;
    private String nombre;
    private string apellido;
    private String gmail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public string getApellido() {
        return apellido;
    }

    public void setApellido(string apellido) {
        this.apellido = apellido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    
    
    
    
    private static class string {

        public string() {
        }
    }
    
    
}
