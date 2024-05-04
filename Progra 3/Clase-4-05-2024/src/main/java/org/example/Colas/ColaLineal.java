package org.example.Colas;

public class ColaLineal {

    protected int fin;
    protected int frente;
    private static int MAXTAMQ = 39;
    protected Object[] listaCola;

    public ColaLineal() {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }

    //Verficar si la cola esta llena
    public boolean colaLlena() {
        return fin == MAXTAMQ - 1;
    }

    //Verificar si la cola esta vacia
    public boolean colaVacia() {
        return frente > fin;
    }

    //insertar
    public void insertar(Object elemento) throws Exception {
        if (!colaLlena()) {
            listaCola[++fin] = elemento;
        } else {
            throw new Exception("Hubo un Overflow!!");
        }
    }

    public Object quitar() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente++];
        } else {
            throw new Exception("Cola Vacia!");
        }
    }

    //borrar cola
    public void borrarCola() {
        frente = 0;
        fin = -1;
    }

    public Object frenteCola() throws Exception {
        if(!colaVacia()) {
            return listaCola[frente];
        } else {
            throw new Exception("Cola Vacia!");
        }
    }
}
