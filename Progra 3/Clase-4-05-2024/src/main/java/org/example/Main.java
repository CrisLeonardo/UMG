package org.example;
import org.example.Colas.ColaLineal;
public class Main {
    public static void main(String[] args) {
        ColaLineal cl = new ColaLineal();
        try{
//            for (int i = 0; i < 100; i++) {
//                cl.insertar(i);
//            }
            cl.insertar("Carlos");
            cl.insertar(3);
            cl.insertar("Andrea");
            cl.insertar(3.5);

            System.out.println("Primer elemento= "+cl.frenteCola());

            //quitar elementos
            while (!cl.colaVacia()) {
                System.out.println("Elemento eliminado: "+cl.quitar());
            }

        }catch (Exception ex) {
            System.out.println("Error "+ex.getMessage());
        }
    }
}