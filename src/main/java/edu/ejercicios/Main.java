package edu.ejercicios;

import edu.ejercicios.ejemplos.clsEjemplo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.printf("Seleccione la opcion del area que quiere calcular de las siguientes figuras\n");

        String[] opciones = {"Circulo","Cubo","Triangulo","Piramide","Prisma","Paralelogramo"};

        System.out.printf("Objetos disponibles para calcular el area: \n");
        for (int i = 0; i < opciones.length; i++){
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una de las opciones (1-" + opciones.length + "):");
        int opc = scanner.nextInt();

        if (opc >= 1 && opc <= opciones.length) {

            String opcioneselegida = opciones[opc - 1];

            switch (opcioneselegida) {
                case "Circulo":
                    System.out.println("Ingresa el radio de un circulo para calcular su area: ");
                    int radio = scanner.nextInt();
                    float areacirculo = 3.1416f * (radio * radio);
                    System.out.println("El Area de tu circulo es de: " + areacirculo);
                    float circunferencia = 2 * 3.1416f * radio;
                    System.out.println("La circunferencia de tu circulo es de: " + circunferencia);

                    break;

                case "Cubo":
                    System.out.println("Elegiste calcular un Cubo\nDame la longitud de dicho cubo para calcular su volumen.");
                    System.out.println("longitud: ");
                    int longitud = scanner.nextInt();
                    float volumen = (longitud << 3);
                    System.out.println("El Area de tu Triangulo es de: " + volumen);
                    break;

                case "Triangulo":
                    System.out.println("Elegiste calcular un Triangulo\nDame la base y la altura de dicho Triangulo para calcular.");
                    System.out.println("Base: ");
                    int Base = scanner.nextInt();
                    System.out.println("Altura: ");
                    int Altura = scanner.nextInt();
                    float areatriangulo = (Base * Altura)/2;
                    float volumentriangulo = (Base * Altura)/3;
                    System.out.println("El Area de tu Triangulo es de: " + areatriangulo);
                    System.out.println("El volumen de tu Triangulo es de: " + volumentriangulo);
                    break;


                case "Piramide":
                    System.out.println("Elegiste calcular una piramide\nDame la base y la altura de dicha piramided para calcula.");
                    System.out.println("Base: ");
                    int BaseP = scanner.nextInt();
                    System.out.println("Altura: ");
                    int AlturaP = scanner.nextInt();
                    float areapiramide = (BaseP * AlturaP)/2;
                    System.out.println("El Area de tu Triangulo es de: " + areapiramide);
                    break;

                case "Prisma":
                    System.out.println("Elegiste calcular un Prisma Rectangular\nDame el largo, ancho y altura de dicho prisma para calcular.");
                    System.out.println("Largo: ");
                    int largo = scanner.nextInt();
                    System.out.println("Ancho: ");
                    int ancho = scanner.nextInt();
                    System.out.println("Altura: ");
                    int altura = scanner.nextInt();
                    float volumenprisma = (largo * ancho * altura);
                    System.out.println("El Area de tu Triangulo es de: " + volumenprisma);
                    break;

                case "Paralelogramo":
                    System.out.println("Elegiste calcular el paralelogramo\nDame la base y la altura del paralelogramo para calcular.");
                    System.out.println("Base: ");
                    int BasePa = scanner.nextInt();
                    System.out.println("Altura: ");
                    int AlturaPa = scanner.nextInt();
                    float aparalelo = BasePa * AlturaPa;
                    System.out.println("El Area de tu paralelogramo es de: " + aparalelo);
                    break;

                case "Cilindro":
                    System.out.println("Elegiste calcular un cilindro   \nDame el radio y la altura del cilindro para calcular.");
                    System.out.println("radio: ");
                    int radioc = scanner.nextInt();
                    System.out.println("Altura: ");
                    int Alturac = scanner.nextInt();
                    double volumenC = Math.PI * Math.pow(radioc, 2) * Alturac;

                    System.out.println("El volumen de tu cilindro es de: " + volumenC);
                    break;

                case "Esfera":
                    System.out.println("Elegiste calcular una esfera \nDame el radio de la esfera para calcular.");
                    System.out.println("radio: ");
                    int radioe = scanner.nextInt();
                    double areae = 4 * Math.PI * Math.pow(radioe, 2);


                    System.out.println("El Area de tu esfera es de: " + areae);
                    break;





            }
        } else {
            System.out.println("Ingresaste una opcion no valida.");
        }
        scanner.close();





       /* String varA,varB = "";
        int a = 0, b = 0;
        try{
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese A: ");
            varA = lector.readLine();
            a = Integer.parseInt(varA);
            System.out.println("Ingrese B: ");
            varB = lector.readLine();
            b = Integer.parseInt(varB);
            System.out.println("valor de a = "+varA+"\nvalor de b = "+varB);
        }catch (Exception ex){
            System.out.println("Ingreso mal el dato");
        }


       clsEjemplo1 objEjemplo1 = new clsEjemplo1();

         objEjemplo1.calculo(a,b);*/

    }
}