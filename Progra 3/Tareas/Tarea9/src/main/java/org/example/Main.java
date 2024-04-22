package org.example;

import org.example.Clases.Telefono;
import org.example.Clases.TelefonosMongo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        TelefonosMongo t = new TelefonosMongo();
        t.conexion();

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Crear teléfono\n2. Leer teléfono\n3. Actualizar teléfono\n4. Eliminar teléfono\n5. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch(opcion) {

            case 1:
                t.crearTelefono();
                break;
            case 2:
                t.leerTelefono();
                break;
            case 3:
                t.leerTelefono();
                t.actualizarTelefono();
                t.leerTelefono();
                break;
            case 4:
                t.eliminarTelefono();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}