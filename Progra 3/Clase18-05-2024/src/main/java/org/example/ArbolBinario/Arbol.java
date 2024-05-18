package org.example.ArbolBinario;

import org.example.ArbolBinario.Nodo;

public class Arbol {

    //nodo raiz del arbol
    private Nodo raiz;

    //constructor de la clase arbol
    public Arbol(){
        this.raiz = null;
    }

    //insertar un nodo con el valor dato, si el arbol esta vacio se crea un nodo
    public void insertar(int dato){
        if (this.raiz == null){
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato); // Llamada correcta al método privado
        }
    }

    //si no tiene valor nulo, se inserta en un orden
    private void insertar(Nodo padre, int dato){
        if (dato < padre.valorNodo()){
            if (padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new Nodo(dato));
            } else {
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        } else if (dato > padre.valorNodo()){
            if (padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new Nodo(dato));
            } else {
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
}
