package org.example.ArbolCadena;

import org.example.ArbolCadena.NodoCadena;

public class ArbolCadenas {

    //nodo raiz del arbol
    private NodoCadena raiz;

    //constructor de la clase arbol
    public ArbolCadenas(){
        this.raiz = null;
    }

    //insertar un nodo con el valor dato, si el arbol esta vacio se crea un nodo
    public void insertar(String dato){
        if (this.raiz == null){
            this.raiz = new NodoCadena(dato);
        } else {
            this.insertar(this.raiz, dato); // Llamada correcta al método privado
        }
    }

    //si no tiene valor nulo, se inserta en un orden
    private void insertar(NodoCadena padre, String dato){
        if (dato.compareTo(dato)>0){
            if (padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new NodoCadena(dato));
            } else {
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        } else {
            if (padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new NodoCadena(dato));
            } else {
                this.insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
}
