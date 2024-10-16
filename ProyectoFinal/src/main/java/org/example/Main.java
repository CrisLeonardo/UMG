package org.example;

// Importación de librerías necesarias
import java.util.*;

// Clase que representa un proceso
class Proceso {
    String nombre;            // Nombre del proceso
    int rafagaCPU;           // Ráfaga de CPU necesaria
    int tiempoLlegada;       // Tiempo de llegada del proceso
    int prioridad;           // Prioridad del proceso
    int tiempoEspera;        // Tiempo de espera en la cola
    int tiempoRetorno;       // Tiempo de retorno total
    int tiempoFinalizacion;  // Tiempo de finalización del proceso


    // Constructor de la clase Proceso
    public Proceso(String nombre, int rafagaCPU, int tiempoLlegada, int prioridad) {
        this.nombre = nombre;
        this.rafagaCPU = rafagaCPU;
        this.tiempoLlegada = tiempoLlegada;
        this.prioridad = prioridad;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa el scanner para la entrada de datos

        // Pedir al usuario la cantidad de procesos
        System.out.print("Ingrese la cantidad de procesos: ");
        int numProcesos = scanner.nextInt(); // Lee la cantidad de procesos
        scanner.nextLine();  // Limpiar el buffer de entrada

        Proceso[] procesos = new Proceso[numProcesos]; // Array para almacenar los procesos

        // Solicitar los datos de cada proceso
        for (int i = 0; i < numProcesos; i++) {
            System.out.println("\nIngrese los datos del proceso " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine(); // Nombre del proceso

            System.out.print("Ráfaga de CPU: ");
            int rafagaCPU = scanner.nextInt(); // Ráfaga de CPU

            System.out.print("Tiempo de llegada: ");
            int tiempoLlegada = scanner.nextInt(); // Tiempo de llegada

            System.out.print("Prioridad: ");
            int prioridad = scanner.nextInt(); // Prioridad del proceso
            scanner.nextLine();  // Limpiar el buffer

            // Crear y almacenar el proceso en el array
            procesos[i] = new Proceso(nombre, rafagaCPU, tiempoLlegada, prioridad);
        }

        // Ordenamos los procesos por tiempo de llegada como precaución inicial
        Arrays.sort(procesos, Comparator.comparingInt(p -> p.tiempoLlegada));

        int tiempoActual = 0; // Tiempo actual del sistema
        int sumaTME = 0, sumaTMR = 0; // Sumas para calcular promedios de tiempos

        System.out.println("\nDiagrama de Gantt:");
        List<Proceso> ordenEjecucion = new ArrayList<>();  // Guardamos el orden de ejecución
        List<Integer> tiemposFinalizacion = new ArrayList<>(); // Lista para tiempos de finalización

        // Cola de prioridad basada en prioridad y tiempo de llegada
        PriorityQueue<Proceso> colaPrioridad = new PriorityQueue<>(
                Comparator.comparingInt((Proceso p) -> p.prioridad)
                        .thenComparingInt(p -> p.tiempoLlegada)
        );

        int index = 0; // Índice para recorrer los procesos
        while (index < procesos.length || !colaPrioridad.isEmpty()) {
            // Agregar procesos disponibles a la cola de prioridad
            while (index < procesos.length && procesos[index].tiempoLlegada <= tiempoActual) {
                colaPrioridad.add(procesos[index]); // Añadir a la cola
                index++;
            }

            // Si la cola está vacía, avanzar al tiempo del próximo proceso
            if (colaPrioridad.isEmpty()) {
                tiempoActual = procesos[index].tiempoLlegada;  // Saltar al siguiente proceso disponible
                continue;
            }

            // Tomar el proceso con mayor prioridad
            Proceso p = colaPrioridad.poll();

            System.out.printf("| %s ", p.nombre);  // Imprimir en el diagrama de Gantt
            tiempoActual += p.rafagaCPU;  // Actualizar el tiempo actual

            p.tiempoFinalizacion = tiempoActual; // Establecer tiempo de finalización
            ordenEjecucion.add(p);  // Guardar el proceso en el orden de ejecución
            tiemposFinalizacion.add(p.tiempoFinalizacion); // Guardar tiempo de finalización
        }
        System.out.println("|"); // Finaliza el diagrama de Gantt

        // Calcular los tiempos de cada proceso según el orden de ejecución
        for (Proceso p : ordenEjecucion) {
            p.tiempoRetorno = p.tiempoFinalizacion - p.tiempoLlegada;  // Tiempo de retorno
            p.tiempoEspera = p.tiempoRetorno - p.rafagaCPU;  // Tiempo de espera

            sumaTME += p.tiempoEspera;  // Sumar tiempos de espera
            sumaTMR += p.tiempoFinalizacion;  // Sumar tiempos de retorno
        }

        // Imprimir los tiempos de finalización
        System.out.println("Tiempos de Finalización:");
        for (int tiempo : tiemposFinalizacion) {
            System.out.printf("%d ", tiempo); // Mostrar tiempos de finalización
        }
        System.out.println();

        // Imprimir los resultados de cada proceso
        System.out.println("\nTiempos de cada proceso:");
        for (Proceso p : ordenEjecucion) {
            System.out.printf("%s: Espera = %d ut, Retorno = %d ut\n",
                    p.nombre, p.tiempoEspera, p.tiempoFinalizacion); // Mostrar tiempos de espera y retorno
        }

        // Calcular y mostrar los promedios
        double promedioTME = (double) sumaTME / procesos.length; // Promedio de tiempos de espera
        double promedioTMR = (double) sumaTMR / procesos.length; // Promedio de tiempos de retorno

        System.out.printf("\nTME Promedio = %.1f ut\n", promedioTME); // Mostrar promedio de tiempos de espera
        System.out.printf("TMR Promedio = %.2f ut\n", promedioTMR);  // Mostrar promedio de tiempos de retorno con dos decimales

        scanner.close();  // Cerrar el scanner al finalizar
    }
}
