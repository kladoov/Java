
package bddoo;

import java.io.Serializable;
import javax.persistence.Embeddable;

/*@author alexk*/
@Embeddable
public class Cancion implements Serializable {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String titulo;
    private String genero;
    
    public Cancion() {}
    
    public Cancion(String tit, String gen) {
        this.titulo = tit;
        this.genero = gen;
    }

    //public Long getId() {return id;}
    //public void setId(Long id) {this.id = id;}
    public String getTituloCancion() {return this.titulo;}
    public String getGeneroCancion() {return this.genero;}
    public void setTituloCancion(String tit) {this.titulo = tit;}
    public void setGeneroCancion(String gen) {this.genero = gen;}
    
    @Override
    public String toString() {
        return "\nCANCION" + "\nTITULO: " + this.titulo +
               "\nGENERO: " + this.genero;
    }
    
}
