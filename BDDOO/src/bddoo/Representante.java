
package bddoo;

import java.io.Serializable;
import javax.persistence.Embeddable;

/*@author alexk*/
@Embeddable
public class Representante implements Serializable {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String nombre;
    private int telefono;
    
    public Representante() {}
    
    public Representante(String nom, int tel) {
        this.nombre = nom;
        this.telefono = tel;
    }

    //public Long getId() {return id;}
    //public void setId(Long id) {this.id = id;}
    public String getNombreRepresentante() {return this.nombre;}
    public int getTelefonoRepresentante() {return this.telefono;}
    public void setNombreRepresentante(String nom) {this.nombre = nom;}
    public void setTelefonoRepresentante(int tel) {this.telefono = tel;}
    
    @Override
    public String toString() {
        return "\nREPRESENTANTE" + "\nNOMBRE: " + this.nombre + 
               "\nTELEFONO: " + this.telefono;
    }
    
}
