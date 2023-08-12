// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Padre.Empleado;
import Hijo.ScrumMaster;

public class Main {

    public static void imprime(Empleado emple){
        System.out.println("Objeto.ObtenerDetalles()=" + emple.obtenerDetalles());
    }

    public static void prueba(int dato){
        System.out.println("Nada");
    }

    public static void determinarTipo(Empleado emple){
        if (emple instanceof ScrumMaster){
            System.out.println("Esto viene de ScrumMaster");
        } else if (emple instanceof Empleado){
            System.out.println("Esto viene de Empleado");
        } else if (emple instanceof Object){
            System.out.println("Esto viene de Object");
        }
    }

    public static void main(String[] args) {



        Empleado em = new Empleado("Juan", 3500);
//        imprime(em);
////        System.out.println(em.obtenerDetalles());
//determinarTipo(em);
        ScrumMaster sm = new ScrumMaster("Juan", 3500, "desarrollo");
        System.out.println(sm.toString());
//        imprime(sm);
//        determinarTipo(sm);


//        System.out.println(sm.obtenerDetalles());



        //em.direccion = "Calle 1";
        /*em.setNombre("Juan");
        em.setSueldo(1000);
        System.out.println("Nombre: " + em.getNombre());
        em.setNombre("homero");
        System.out.println("Nombre: " + em.getNombre());*/
        }
    }
