package org.example;

import org.example.Conexions;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Conexions cone = new Conexions();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar datos de la base de datos");
            System.out.println("2. Ingresar nuevos datos");
            System.out.println("3. Actualizar datos");
            System.out.println("4. Eliminar datos");
            System.out.println("5. Salir");
            System.out.print("Opción:");

            try {
                int opcion = sc.nextInt(); // Lee la opción ingresada por el usuario.
                sc.nextLine(); // Limpia el búfer del scanner.

                switch (opcion) {
                    case 1:
                        cone.leerDatos(); // Llama al método para leer datos de la base de datos.
                        break;
                    case 2:
                        cone.insertarDatos(); // Llama al método para insertar datos en la base de datos.
                        cone.leerDatos(); // Llama al método para mostrar los datos actualizados.
                        esperarEnter(); // Llama a la función para esperar la entrada del usuario.
                        break;
                    case 3:
                        cone.actualizarDatos(); // Llama al método para actualizar datos en la base de datos.
                        cone.leerDatos(); // Llama al método para mostrar los datos actualizados.
                        esperarEnter(); // Llama a la función para esperar la entrada del usuario.
                        break;
                    case 4:
                        cone.eliminarDatos(); // Llama al método para eliminar datos en la base de datos.
                        cone.leerDatos(); // Llama al método para mostrar los datos actualizados.
                        esperarEnter(); // Llama a la función para esperar la entrada del usuario.
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.exit(0); // Sale del programa.
                    default:
                        System.out.println("Error: Ingrese una opción válida.");
                }
            } catch (InputMismatchException var4) {
                System.out.println("Error: Ingrese una opción válida.");
                sc.nextLine(); // Limpia el búfer del scanner.
            } catch (SQLException var5) {
                System.out.println("Error: " + var5.getMessage());
            }
        }
    }

    // Función que muestra un mensaje y espera a que el usuario presione Enter.
    private static void esperarEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Espera hasta que el usuario presione Enter.
    }
}
