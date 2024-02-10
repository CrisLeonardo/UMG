package org.example;
import org.example.clase.Persona;
import org.example.clase.TablaPronostico;

public class Main {

    public static void main(String[] args) {
//                Persona[] personas = new Persona[3];
//
//        //asignar le objeto persona
//        personas[0] = new Persona("Juan", 25);
//        personas[1] = new Persona("Karla", 30);
//        personas[2] = new Persona("Pedro", 35);
//
////        for (Persona persona: personas) {
////            System.out.println(persona);
////        }
//
//        //Ahora con matrix
//        Persona[][] matrix = new Persona[2][2];
//        matrix[0][0] = new Persona("Juana", 25);
//        matrix[0][1] = new Persona("Karla", 30);
//        matrix[1][0] = new Persona("Maria", 55);
//        matrix[1][1] = new Persona("Pedro", 35);
//
//        for (Persona[] fila: matrix) {
//            for (Persona persona: fila) {
//                System.out.println(persona);
//            }
//        }
//
////        Persona[] personas = new Persona[3];
////
////        //asignar le objeto persona
////        personas[0] = new Persona("Juan", 25);
////        personas[1] = new Persona("Karla", 30);
////        personas[2] = new Persona("Pedro", 35);
////
////        for (Persona persona: personas) {
////            System.out.println(persona);
////        }

        TablaPronostico tabla = new TablaPronostico();
        tabla.calculos();


    }

}