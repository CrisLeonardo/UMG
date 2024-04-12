package org.example;

public class Playlist {

    Nodo cabeza;

    public Playlist() {
        this.cabeza = null;
    }

    public void agregarCancion(String nombre, String artista, String genero, int duracion) {
        Nodo nuevaCancion = new Nodo(nombre, artista, genero, duracion);
        if (cabeza == null) {
            cabeza = nuevaCancion;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevaCancion;
        }
    }

    public void imprimirPlaylist() {
        Nodo temp = cabeza;
        int Numeracion = 1;
        while (temp != null) {
            System.out.println(Numeracion + ". "+temp.nombre + ", Artista: " + temp.artista + ", Género: " + temp.genero + ", Duración: " + temp.duracion + "s\n");
            temp = temp.siguiente;
            Numeracion++;
        }
    }

    public void eliminarCancion(String nombre) {
        if (cabeza == null) {
            System.out.println("La playlist está vacía.");
            return;
        }
        if (cabeza.nombre.equals(nombre)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        while (temp.siguiente != null && !temp.siguiente.nombre.equals(nombre)) {
            temp = temp.siguiente;
        }
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
        } else {
            System.out.println("Canción no encontrada en la playlist.");
        }
    }

    public void insertarCancion(String nombre, String artista, String genero, int duracion, int posicion) {
        Nodo nuevaCancion = new Nodo(nombre, artista, genero, duracion);
        if (posicion == 0) {
            nuevaCancion.siguiente = cabeza;
            cabeza = nuevaCancion;
            return;
        }
        Nodo temp = cabeza;
        for (int i = 0; i < posicion - 1 && temp != null; i++) {
            temp = temp.siguiente;
        }
        if (temp == null) {
            System.out.println("Posición inválida.");
        } else {
            nuevaCancion.siguiente = temp.siguiente;
            temp.siguiente = nuevaCancion;
        }
    }

    public void buscarCancion(String nombre) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.nombre.equals(nombre)) {
                System.out.println("Nombre: " + temp.nombre + ", Artista: " + temp.artista + ", Género: " + temp.genero + ", Duración: " + temp.duracion + " segundos");
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("Canción no encontrada en la playlist.");
    }

    public void ordenarPlaylist() {
        // Implementar algoritmo de ordenamiento (ejemplo: Bubble Sort)
    }

    public void calcularDuracionTotal() {
        int duracionTotal = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            duracionTotal += temp.duracion;
            temp = temp.siguiente;
        }
        int minutos = duracionTotal / 60;
        int segundos = duracionTotal % 60;
        System.out.println("Duración total de la playlist: " + minutos + " minutos " + segundos + " segundos");
    }

}
