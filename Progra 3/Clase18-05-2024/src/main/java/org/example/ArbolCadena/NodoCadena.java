package org.example.ArbolCadena;

public class NodoCadena {

    protected String dato;
    protected NodoCadena Izdo;
    protected NodoCadena Dcho;

    public NodoCadena(String valor){
        dato = valor;
        Izdo = Dcho = null;
    }

    public NodoCadena (NodoCadena RamaIzdo, String valor, NodoCadena RamaDcho){
        dato = valor;
        Izdo = RamaIzdo;
        Dcho = RamaDcho;
    }

    public String valorNodo(){ return dato; }
    public NodoCadena GetSubarbolIzdo(){ return Izdo; }
    public NodoCadena GetSubarbolDcho(){ return Dcho; }

    public void nuevoValor( String d){ dato = d; }
    public void SetRamaIzdo(NodoCadena n){ Izdo = n; }
    public void SetRamaDcho(NodoCadena n){ Dcho = n; }

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}
