package org.example;

import java.util.Arrays;

public class Ejercicio2Pagina {

    // Método para multiplicar matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Método para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para mostrar información de la clase
    public static void mostrarInformacion() {
        System.out.println("Esta es la clase Ejercicio2Pagina:");
        System.out.println("Esta clase contiene métodos para multiplicar matrices.");
    }

    public static void main(String[] args) {
        mostrarInformacion();

        int[][] matrixa = {{1, 2, 3}, {1, 1, 1}, {0, 1, -1}};
        int[][] matrixb = {{1}, {2}, {1}};
        int[][] matrixc = {{2, 1, 0}, {3, 4, 5}};

        System.out.println("\nMatrix A:");
        printMatrix(matrixa);
        System.out.println("Matrix B:");
        printMatrix(matrixb);
        System.out.println("Matrix C:");
        printMatrix(matrixc);

        System.out.println("Multiplication of Matrix A and Matrix B:");
        int[][] resultAB = multiply(matrixa, matrixb);
        printMatrix(resultAB);

        System.out.println("Multiplication of Matrix A and Matrix C:");
        int[][] resultAC = multiply(matrixa, matrixc);
        printMatrix(resultAC);
    }
}
