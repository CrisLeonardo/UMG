package org.example;

import java.util.Arrays;

public class Ejercicio1Pagina {

    public Ejercicio1Pagina(int[][] matrix1) {
    }

    // Implementación de Selection Sort
    public static void selectionSort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[j][0] < matrix[minIndex][0]) {
                    minIndex = j;
                }
            }
            int[] temp = matrix[minIndex];
            matrix[minIndex] = matrix[i];
            matrix[i] = temp;
        }
    }

    // Multiplicación de matrices
    public static int[][] matrixMultiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = B[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Función para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // Método para mostrar en pantalla la información de la clase
    public static void mostrarInformacion() {
        System.out.println("Esta es la clase Ejercicio1Pagina:");
        System.out.println("Esta clase contiene métodos para ordenar matrices y multiplicar matrices.");
    }

    public static void main(String[] args) {
        mostrarInformacion();

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{5, -1}, {1, 0}, {-2, 3}};

        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        // Ordenar la primera matriz utilizando Selection Sort
        selectionSort(matrix1);
        System.out.println("\nMatrix 1 Ordenada con Selection Sort:");
        printMatrix(matrix1);

        // Multiplicar las matrices
        int[][] result = matrixMultiply(matrix1, matrix2);
        System.out.println("\nResultado de la multiplicación:");
        printMatrix(result);
    }
}
