package org.example;

public class Nodo {

    String nombre;
    String artista;
    String genero;
    int duracion; // en segundos
    Nodo siguiente;

    public Nodo(String nombre, String artista, String genero, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.siguiente = null;
    }


}
