package org.example;
import org.example.Pilas.PilaLineal;


public class Main {

    public static void palindromo(){
        PilaLineal pila = new PilaLineal();
        String palabra = "oso";
        String palabraInvertida = "";


        //creamos la pila con la palabra
        for(int i=0;i < palabra.length(); i++){
            try{
                pila.insertar(palabra.charAt(i));
            }catch(Exception ex){
                System.out.println("Problema al insertar!: "+ex.getMessage());
            }
        }

        //se comprueba si es palindromo
        while (!pila.pilaVacia()){
            try {
                palabraInvertida += pila.quitar();
            }catch(Exception ex){
                System.out.println("error comprobando!");
            }
        }

        if (palabraInvertida.equals(palabra)){
            System.out.println("simon, es un palindromo");
        }else{
            System.out.println("nel, no es un palindromo");
        }
    }



  public static void main(String[] args) {

        palindromo();
    }
  }
//
//
//        PilaLineal pil = new PilaLineal();
//
//        try{
//            pil.insertar("Hola");
//            pil.insertar("Mundo");
//            pil.insertar("Esta");
//            pil.insertar("Es Una");
//            pil.insertar("Pila");
//            while(!pil.pilaVacia()){
//                System.out.println("Elemento saliente: "+pil.quitar());
//            }
//        }catch(Exception ex){
//            System.out.println("ups hay un problema: "+ex.getMessage());
//        }
//    }
