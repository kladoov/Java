package com.mycompany.spotify;

/*@author alekk*/
public class Spotify {
    
    public static void espacios() {
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("");
    }

    public static void main(String[] args) {
        Song song = new Song("Dolce", "Soto Asa", "reggaeton");
        song.ComprobarGeneroMusical("reggaeton");
        System.out.println(song.toString());
        
        Song song2 = new Song("A la vez", "Ernes H", "chill");
        song.ComprobarGeneroMusical("chill");
        System.out.println(song2.toString());
        
        // Add song to list
        ListaSpotify listaSpotify = new ListaSpotify("Summer 2024", song);
        espacios();
        listaSpotify.AddListaSpotify(song);
        listaSpotify.AddListaSpotify(song2);
        espacios();
        listaSpotify.MostrarListaSpotify();
        listaSpotify.DeleteListaSpotify("Dolce");
        listaSpotify.DeleteListaSpotify("Dolce");


    }
}
