
package com.mycompany.spotify;

import java.util.ArrayList;
import java.util.List;

/*@author alekk*/

public class ListaSpotify {
    private String nombreLista;
    private List<Song> lista;
    
    public ListaSpotify(String nombreLista, Song song) {
        this.nombreLista = nombreLista;
        this.lista = new ArrayList<>();
    }
    
    // Add song to list
    public void AddListaSpotify(Song song) {
        // add to list if size at list is 0
        if (lista.isEmpty()) {
            lista.add(song);
            System.out.println("Cancion " + lista.get(0).getTitulo() + " añadida a la lista exitosamente.");
            return;
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equalsIgnoreCase(song.getTitulo())) {
                System.out.println("La cancion " + lista.get(i).getTitulo() + " ya existe en la lista.");
            } else {
                lista.add(song);
                System.out.println("Cancíon " + lista.get(i).getTitulo() + " añadida a la lista exitosamente.");
                return;
            }
        }
    }
    
    // Delete song about name song
    public void DeleteListaSpotify(String titulo) {
        if (lista.isEmpty()) {
            return;
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("La cancion " + lista.get(i).getTitulo() + " ha sido eliminada de la lista.");
                lista.remove(i);
                return;
            }
        }
    }
    
    // Muestro la lista que haya en este momento
    public void MostrarListaSpotify() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(this.toString());
            
            Song song = lista.get(i);
            System.out.println("Titulo: " + song.getTitulo() + ", cantante " +
                                song.getCantante() + ", genero " +  song.getGenero());
            System.out.println("");
        }
    }
    
    @Override
    public String toString() {
        return "Nombre de la lista: " + nombreLista;
    }
    
}
