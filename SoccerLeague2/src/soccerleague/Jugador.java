
package soccerleague;

public class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;

public Jugador() {
    nombre=generarNombre();
    edad=generarEdad();
    nacionalidad=generarNacionalidad();
}

public Jugador (String nom, int ed, String nac) {
    this.nombre = nom;
    this.edad = ed;
    this.nacionalidad = nac;
}

public String generarNombre() {
    String nombre[] = {"Lionel Messi", "Cristiano Ronaldo", "Neymar Jr", "Kylian Mbappe", "Robert Lewandowski",
    "Mohamed Salah", "Kevin De Bruyne", "Sadio Mane", "Virgil van Dijk", "Jan Oblak",
    "Manuel Neuer", "Alisson Becker", "Ederson Moraes", "Marc-André ter Stegen", "Thibaut Courtois",
    "Sergio Ramos", "Virgil van Dijk", "Kalidou Koulibaly", "Marquinhos", "Aymeric Laporte",
    "Trent Alexander-Arnold", "Joshua Kimmich", "Andy Robertson", "Jordi Alba", "Andrew Robertson",
    "David Alaba", "Leonardo Bonucci", "Giorgio Chiellini", "Sergio Busquets", "Frenkie de Jong",
    "Paul Pogba", "N'Golo Kanté", "Bruno Fernandes", "Luka Modric", "Toni Kroos",
    "Kevin De Bruyne", "Raheem Sterling", "Harry Kane", "Erling Haaland", "Romelu Lukaku", "Ayendi", "Mariano"};
    int nombreRandom = (int)(Math.random() * (nombre.length));
    return nombre[nombreRandom];
}

public int generarEdad(){
    int min = 18, max = 36, random;
    random=((int)(Math.random() * (max - min+1) + min));
    return random;
}

public String generarNacionalidad(){
    String nacionalidad[] = {"Argentina", "Brasil", "España", "Alemania", "Portugal", "Francia", "Italia", "Países Bajos", 
    "Bélgica", "Inglaterra", "Gales", "Escocia", "Irlanda del Norte", "Uruguay", "Paraguay",
    "Colombia", "Chile", "Perú", "Ecuador", "México", "Estados Unidos", "Canadá", "Japón",
    "Corea del Sur", "China", "Australia", "Nueva Zelanda", "Argelia", "Egipto", "Senegal",
    "Camerún", "Costa de Marfil", "Ghana", "Nigeria", "Marruecos", "Túnez", "Serbia", "Croacia",
    "Bosnia y Herzegovina", "Eslovenia", "Macedonia del Norte", "Suiza", "Dominicano", "Rodense"};
    int nacionalidadRandom = (int)(Math.random() * (nacionalidad.length));
    return nacionalidad[nacionalidadRandom];
}


public String getNombreJugador() {return nombre;}
public int getEdadJugador() {return edad;}
public String getNacionalidadJugador() {return nacionalidad;}


@Override
public String toString () {
    String text = "Jugador " + nombre + ", edad " + edad + " con nacionalidad " + nacionalidad + ".";
    return text;
}

}