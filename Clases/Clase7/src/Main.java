// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import pkgAlumnos.Alumnos;
import pkgAlumnos.Curso;
import pkgAlumnos.CursosAsignados;

public class Main {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos("201504100", "Juan Perez", "12345678", "Jutiapa", new CursosAsignados(), 0);
        Curso cur = new Curso("MAT101", "Matematica Basica", 1000);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso("derecho102", "derecho", 1));

        System.out.println("\n\nCursos asignados a " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());
        System.out.println("Telefono: " + alumno1.getTelefono());
        System.out.println("Direccion: " + alumno1.getDireccion());

double totalcurso1 = 0;
        for (Curso curso : alumno1.getCursos()) {
            totalcurso1 = totalcurso1 + curso.getCosto();
            System.out.println("Curso: " + curso.getNombre() + " Costo: " + curso.getCosto());
        }
        System.out.println("Total a pagar: " + totalcurso1);

        Alumnos alumno2 = new Alumnos("201545621", "David Juarez", "87654321", "Jutiapa", new CursosAsignados(), 0);
        Curso cur2 = new Curso("PROGRA101", "Programacion I", 1500);
        alumno2.agregarCurso(cur2);
        alumno2.agregarCurso(new Curso("FISICA102", "fisica", 679));

        System.out.println("\n\nCursos asignados a " + alumno2.getNombre());
        System.out.println("Carnet: " + alumno2.getCarnet());
        System.out.println("Telefono: " + alumno2.getTelefono());
        System.out.println("Direccion: " + alumno2.getDireccion());
        double totalcurso2 = 0;
        for (Curso curso : alumno2.getCursos()) {
            totalcurso2 = totalcurso2 + curso.getCosto();
            System.out.println("Curso: " + curso.getNombre() + " Costo: " + curso.getCosto());
        }
        System.out.println("Total a pagar: " + totalcurso2);


        Alumnos alumno3 = new Alumnos("165984321", "Blanca morales", "123654789", "Barberena", new CursosAsignados(), 0);
        Curso cur3 = new Curso("PROGRA102", "Programacion II", 1200);
        alumno3.agregarCurso(cur3);
        alumno3.agregarCurso(new Curso("FISICA103", "fisica II", 800));

        System.out.println("\n\nCursos asignados a " + alumno3.getNombre());
        System.out.println("Carnet: " + alumno3.getCarnet());
        System.out.println("Telefono: " + alumno3.getTelefono());
        System.out.println("Direccion: " + alumno3.getDireccion());

        //iteracion
double totalcurso3 = 0;
        for (Curso curso : alumno3.getCursos()) {
            totalcurso3 = totalcurso3 + curso.getCosto();
            System.out.println("Curso: " + curso.getNombre() + " Costo: " + curso.getCosto());
        }
        System.out.println("Total a pagar: " + totalcurso3);


        double ingresos = totalcurso1 + totalcurso2 + totalcurso3;
        System.out.println("\n\nTotal de ingresos: " + ingresos);
    }
}
