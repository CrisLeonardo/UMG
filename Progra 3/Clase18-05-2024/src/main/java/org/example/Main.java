package org.example;

import org.example.ArbolBinario.Arbol;
import org.example.ArbolCadena.ArbolCadenas;

public class Main {
    public static void main(String[] args) {
//        Arbol arbol = new Arbol();
//        arbol.insertar(10);
//        arbol.insertar(5);
//        arbol.insertar(15);
//        arbol.insertar(3);
//        arbol.insertar(6);
//        arbol.insertar(12);
//        arbol.insertar(18);

        ArbolCadenas cadena = new ArbolCadenas();
        cadena.insertar("Hola");
        cadena.insertar("Mundo");
        cadena.insertar("Java");
        cadena.insertar("Arbol");
        cadena.insertar("Cadena");
        cadena.insertar("Binario");
    }
}
