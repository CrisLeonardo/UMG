package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        // Definir la matriz de ventas (5 filas x 12 columnas)
        int[][] ventas = new int[5][12];

        // Generar valores aleatorios para las ventas
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = random.nextInt(10000) + 1; // Ventas entre 1 y 10000
            }
        }



        Scanner scanner = new Scanner(System.in);

        int opcion;
        int cantidadVentas = 0;

        do {
            System.out.println("**Elige un día de la semana:**");
            System.out.println("1. Imprimir la matriz por filas usando forEach");
            System.out.println("2. Ordenar los elementos de una matriz por columna");
            System.out.println("3. Filtrar elementos de una matriz por un criterio");
            System.out.println("0. Salir del programa");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Imprimir matriz por filas usando forEach\n");
                    // Imprimir la matriz de ventas por filas usando forEach
                    System.out.println("Matriz de ventas:");
                    Arrays.stream(ventas).forEach(fila -> {
                        for (int valor : fila) {
                            System.out.printf("%8d  ", valor);
                        }
                        System.out.println();
                    });
                    break;
                case 2:
                    System.out.println("Ordenar los elementos de una matriz por columna\n");

                    // Ordenar los elementos de la matriz por columna (usando un índice como referencia)
                    for (int i = 0; i < ventas[0].length; i++) {
                        // Crear un stream para la columna actual
                        int finalI = i;
                        int[] columna = Arrays.stream(ventas).mapToInt(fila -> fila[finalI]).toArray();

                        // Ordenar la columna
                        Arrays.sort(columna);

                        // Actualizar la matriz con la columna ordenada
                        for (int j = 0; j < ventas.length; j++) {
                            ventas[j][i] = columna[j];
                        }
                    }

                    // Imprimir la matriz ordenada
                    System.out.println("Matriz de ventas ordenada por columna:");
                    Arrays.stream(ventas).forEach(fila -> {
                        for (int valor : fila) {
                            System.out.printf("%8d  ", valor);
                        }
                        System.out.println();
                    });
                    break;
                case 3:
                    System.out.println("Filtrar elementos de una matriz por un criterio\n");
                    System.out.println("Ventas mayores a:");
                    cantidadVentas  = scanner.nextInt();
                    // Filtrar elementos de la matriz por un criterio (por ejemplo, ventas mayores a 5000)
                    System.out.println("Ventas mayores a:" +cantidadVentas );
                    int finalCantidadVentas = cantidadVentas;
                    Arrays.stream(ventas).flatMapToInt(fila -> Arrays.stream(fila).filter(valor -> valor > finalCantidadVentas)).forEach(System.out::println);

                    break;
                case 0:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige un número del 0 al 7.");
            }

            if (opcion != 0) {
                System.out.println("\n**¿Qué deseas hacer?**");
                System.out.println("1. Salir del programa");
                System.out.println("2. Regresar al menú principal");

                int opcion2 = scanner.nextInt();

                if (opcion2 == 1) {
                    opcion = 0;
                }
            }

        } while (opcion != 0);
    }
}
