package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Playlist playlist = new Playlist();
    static Pausa pausa = new Pausa();

    static {
        // Agregar canciones de ejemplo
        playlist.agregarCancion("Little Dark Age", "MGMT", "Rock", 299);
        playlist.agregarCancion("I Will Survive", "Gloria Gaynor", "Rock", 240);
        playlist.agregarCancion("Dream Space", "DVRST", "Phonk", 171);
        playlist.agregarCancion("T.N.T", "AC/CD", "Rock", 215);
        playlist.agregarCancion("Master Of Puppets", "Metallica", "Rock", 515);
        playlist.agregarCancion("Du Hast", "Rammstein", "Metal", 360);
        playlist.agregarCancion("Breaking the Habit", "Linkin Park", "Rock", 230);
        playlist.agregarCancion("Toxicity", "System Of A Down", "Rock", 222);
        playlist.agregarCancion("Enter Sandman", "Metallica", "Rock", 444);
        playlist.agregarCancion("Fuel", "Metallica", "Rock", 111);


        // Agrega más canciones según sea necesario
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Imprimir playlist");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Insertar nueva canción");
            System.out.println("4. Buscar canción");
            System.out.println("5. Ordenar playlist");
            System.out.println("6. Calcular duración total");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    playlist.imprimirPlaylist();
                    pausa.pausa();

                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la canción a eliminar: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombreEliminar = scanner.nextLine();
                    playlist.eliminarCancion(nombreEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la nueva canción: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombreNueva = scanner.nextLine();
                    System.out.print("Ingrese el artista de la nueva canción: ");
                    String artistaNueva = scanner.nextLine();
                    System.out.print("Ingrese el género de la nueva canción: ");
                    String generoNueva = scanner.nextLine();
                    System.out.print("Ingrese la duración de la nueva canción (en segundos): ");
                    int duracionNueva = scanner.nextInt();
                    System.out.print("Ingrese la posición en la que desea insertar la nueva canción: ");
                    int posicionNueva = scanner.nextInt();
                    playlist.insertarCancion(nombreNueva, artistaNueva, generoNueva, duracionNueva, posicionNueva);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la canción a buscar: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombreBuscar = scanner.nextLine();
                    playlist.buscarCancion(nombreBuscar);
                    break;
                case 5:
                    playlist.ordenarPlaylist();
                    System.out.println("Playlist ordenada.");
                    break;
                case 6:
                    playlist.calcularDuracionTotal();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();

    }

    static class Pausa {
        public void pausa() {
            try {
                System.out.println("Presione Enter para continuar...");
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}