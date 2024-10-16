package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Proceso {
    String nombre;
    int rafagaCpu;
    int tiempoLlegada;
    int prioridad;
    int tiempoEspera;
    int tiempoRegreso;

    public Proceso(String nombre, int rafagaCpu, int tiempoLlegada, int prioridad) {
        this.nombre = nombre;
        this.rafagaCpu = rafagaCpu;
        this.tiempoLlegada = tiempoLlegada;
        this.prioridad = prioridad;
        this.tiempoEspera = 0;
        this.tiempoRegreso = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Proceso[] procesos = {
                new Proceso("A", 5, 3, 3),
                new Proceso("B", 2, 1, 1),
                new Proceso("C", 3, 4, 5),
                new Proceso("D", 3, 3, 2),
                new Proceso("E", 0, 0, 0),
                new Proceso("F", 2, 4, 4),
                new Proceso("G", 6, 4, 1)
        };

        // Ordenar los procesos por tiempo de llegada
        Arrays.sort(procesos, Comparator.comparingInt(p -> p.tiempoLlegada));

        int tiempoActual = 0;
        boolean[] ejecutado = new boolean[procesos.length];

        // Calcular el tiempo de regreso y el tiempo de espera
        while (true) {
            // Buscar el proceso que se puede ejecutar
            int indiceProceso = -1;
            for (int i = 0; i < procesos.length; i++) {
                if (!ejecutado[i] && procesos[i].tiempoLlegada <= tiempoActual) {
                    if (indiceProceso == -1 || procesos[i].prioridad < procesos[indiceProceso].prioridad) {
                        indiceProceso = i;
                    }
                }
            }

            // Si no hay procesos listos, avanzar el tiempo
            if (indiceProceso == -1) {
                boolean todosEjecutados = true;
                for (boolean e : ejecutado) {
                    if (!e) {
                        todosEjecutados = false;
                        break;
                    }
                }
                if (todosEjecutados) break; // Salir si todos los procesos han sido ejecutados
                tiempoActual++;
                continue;
            }

            // Ejecutar el proceso encontrado
            Proceso p = procesos[indiceProceso];
            tiempoActual += p.rafagaCpu; // Avanzar el tiempo por la ráfaga del proceso
            p.tiempoRegreso = tiempoActual; // Calcular tiempo de regreso
            p.tiempoEspera = p.tiempoRegreso - p.tiempoLlegada - p.rafagaCpu; // Calcular tiempo de espera
            ejecutado[indiceProceso] = true; // Marcar proceso como ejecutado
        }

        // Calcular tiempos medios
        double totalTiempoEspera = 0;
        double totalTiempoRegreso = 0;
        int numProcesos = procesos.length;

        for (Proceso p : procesos) {
            totalTiempoEspera += p.tiempoEspera;
            totalTiempoRegreso += p.tiempoRegreso;
            System.out.println("Proceso " + p.nombre + ": TE = " + p.tiempoEspera + " | TR = " + p.tiempoRegreso);
        }

        double tiempoMedioEspera = totalTiempoEspera / numProcesos;
        double tiempoMedioRegreso = totalTiempoRegreso / numProcesos;

        System.out.printf("Tiempo Medio de Espera (TME): %.2f%n", tiempoMedioEspera);
        System.out.printf("Tiempo Medio de Regreso (TMR): %.2f%n", tiempoMedioRegreso);
    }
}
