package org.example.ArbolBinario;

public class Nodo {

    protected int dato;
    protected Nodo Izdo;
    protected Nodo Dcho;

    public Nodo(int valor){
        dato = valor;
        Izdo = Dcho = null;
    }

    public Nodo (Nodo RamaIzdo, int valor, Nodo RamaDcho){
        dato = valor;
        Izdo = RamaIzdo;
        Dcho = RamaDcho;
    }

    public int valorNodo(){ return dato; }
    public Nodo GetSubarbolIzdo(){ return Izdo; }
    public Nodo GetSubarbolDcho(){ return Dcho; }

    public void nuevoValor(int d){ dato = d; }
    public void SetRamaIzdo(Nodo n){ Izdo = n; }
    public void SetRamaDcho(Nodo n){ Dcho = n; }

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}
