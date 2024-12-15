package com.mycompany.spotify;

import java.util.Random;

/*@author alekk*/

public class Song {
    public String titulo, cantante, genero;
    
    // Constructor
    public Song(String titulo, String cantante, String genero){
        this.titulo = titulo;
        this.cantante = cantante;
        this.genero = genero;
    }
    
    /*Método para comprobar el genero musical de forma que si el valor introducido no es ninguno de 
    los que aparecen en el enunciado, se debe lanzar una excepción CancionExcepcion, indicando un 
    código de error (número aleatorio entre 10 y 20) y una frase indicando que dicho genero musical 
    no se encuentra en nuestras listas de Spotify.*/
    public void ComprobarGeneroMusical(String genero) {
        // generos admitidos
        String[] generos = {"jazz", "rock", "techno", "pop", "flamenco", "disco", "reggaeton", "chill"};
        
        for (int i = 0; i < generos.length; i++) {
            if (generos[i].equals(genero)) {
                System.out.println("Genero " + genero + " admitido.");
                return;
            }
        }
        
        Random random = new Random();
        int num = random.nextInt(20);
        System.out.println("Error: " + num + ". El genero " + genero + " no existe en nuestra lista de generos.");
    }
    
    @Override
    public String toString() {
        return "-----CANCION-----" +
               "\nTitulo: " + this.titulo +
               "\nCantante: " + this.cantante +
               "\nGenero: " + this.genero;
    }
    
    // getters
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getCantante() {
        return this.cantante;
    }
    
    public String getGenero() {
        return this.genero;
    }

}
