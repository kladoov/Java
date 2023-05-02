
package soccerleague;

public class Arbitraje {
    private Arbitro arbitro;
    private ArbitroAsistente linierDerecho;
    private ArbitroAsistente linierIzquierdo;
    
public Arbitraje() {
    this.arbitro = importaArbitro();
    this.linierDerecho = importaLinierDerecha();
    this.linierIzquierdo = importaLinierIzquierda();
}

public Arbitro importaArbitro() {
    Arbitro arb = new Arbitro();
    return arb;
}

public ArbitroAsistente importaLinierDerecha() {
    ArbitroAsistente arb = new ArbitroAsistente("Derecha");
    return arb;
}

public ArbitroAsistente importaLinierIzquierda() {
    ArbitroAsistente arb = new ArbitroAsistente("Izquierda");
    return arb;
}


public Arbitro getArbitro() {return arbitro;}
public ArbitroAsistente getLinierDerecho() {return linierDerecho;}
public ArbitroAsistente getLinierIzquierdo() {return linierIzquierdo;}

@Override
public String toString() {
    return arbitro.toString() + "\n" + "\n"+ linierDerecho.toString() + "\n" + "\n" + linierIzquierdo.toString();
}

}

    