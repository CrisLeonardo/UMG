package org.example.Vista;

import org.example.Modelo.Contacto;
import org.example.Servicio.Agenda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Juan Perez", 123456789, "juan.perez@example.com", LocalDate.of(1990, 5, 15));
        agenda.agregarContacto("Maria Lopez", 987654321, "maria.lopez@example.com",     LocalDate.of(1992, 12, 10));
        agenda.agregarContacto("Carlos Sanchez", 456789123, "carlos.sanchez@example.com", LocalDate.of(1985, 8, 20));

        // Mostrar contactos
        System.out.println("Contactos actuales en la agenda:");
        agenda.mostrarContactos();
        String rutaArchivo = "D:\\AgendaFinal\\agendaFinal.dat";
        // Guardar la agenda en un archivo

        agenda.guardarAgenda(rutaArchivo);

        // Crear una nueva agenda y cargar los contactos desde el archivo
        Agenda agendaCargada = new Agenda();
        agendaCargada.cargarAgenda(rutaArchivo);

        // Mostrar contactos cargados
        System.out.println("\nContactos cargados desde el archivo:");
        agendaCargada.mostrarContactos();

        // Buscar contactos
        System.out.println("\nBuscando contactos:");
        Contacto encontrado = agendaCargada.buscarContacto("Maria Lopez");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado.getNombre() + ", Teléfono: " + encontrado.getTelefono()  + ", Correo Electrónico: " + encontrado.getCorreoElectronico());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        encontrado = agendaCargada.buscarContacto("456789123");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado.getNombre() + ", Teléfono: " + encontrado.getTelefono() + ", Correo Electrónico: " + encontrado.getCorreoElectronico());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        encontrado = agendaCargada.buscarContacto("juan.perez@example.com");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado.getNombre() + ", Teléfono: " + encontrado.getTelefono() + ", Correo Electrónico: " + encontrado.getCorreoElectronico());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Buscar contacto por fecha de nacimiento
        encontrado = agendaCargada.buscarContactoPorFechaNacimiento(LocalDate.of(1985, 8, 20));
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado.getNombre() + ", Fecha de Nacimiento: " + encontrado.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}