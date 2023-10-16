
package bddoo;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*@author alexk*/

@Entity
public class Orquesta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private int numComponentes;
    @Embedded
    private Cancion cancion;
    @Embedded
    private Representante representante;
    
    public Orquesta() {}
    
    public Orquesta(String nombre, int num, Cancion ca, Representante re) {
        this.nombre = nombre;
        this.numComponentes = num;
        this.cancion = ca;
        this.representante = re;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getNumComponentes() {return numComponentes;}
    public void setNumComponentes(int numComponentes) {this.numComponentes = numComponentes;}
    public Cancion getCancion() {return cancion;}
    public void setCancion(Cancion cancion) {this.cancion = cancion;}
    public Representante getRepresentante() {return representante;}
    public void setRepresentante(Representante representante) {this.representante = representante;}
    
    
    @Override
    public String toString() {
        return "ORQUESTA " + this.id +
               "\nNOMBRE " + this.nombre +
               "\nNº COMPONENTES " + this.numComponentes +
               this.cancion.toString() +
               this.representante.toString();
    }

}
