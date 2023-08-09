package excepciones;

public class CiudadPartidoExcepcion extends Exception {

    private int codError;
    private String nombreCiudad;

    public CiudadPartidoExcepcion() {
        this.codError = (int) (Math.random() * (5 - 1) + 1);
        this.nombreCiudad = "Mozambique";
    }

    public String toString() {
        return "Error: " + this.codError + ". " + "Pais de juego igual que el equipo."
                + "\nApartir de este momento se jugara en: " + nombreCiudad;
    }

}
