// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Nieto.Topping;
import Padre.Pizza;
import Hijo.PizzaItaliana;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        String nombrep = "";
        double preciop = 0;
        String ingredientesp = "";
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola bienvenido a la pizzeria lugis");
        System.out.println("Elija su pizza:");
        System.out.println("1. Pizza de la casa: Q60\n2. Pizza de carnes: Q80\n3. Pizza 4 quesos: Q75\n4. Pizza Simple: Q50\n");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido una Pizza de la casa.");
                nombrep = "Pizza de la casa";
                preciop = 60;
                ingredientesp = "Peperoni,piña,queso,aceitunas";
                break;
            case 2:
                System.out.println("Has elegido una pizza de de carnes.");
                nombrep = "pizza de carnes";
                preciop = 80;
                ingredientesp = "carne de res, pollo, carne de cerdo";
                break;
            case 3:
                System.out.println("Has elegido una Pizza 4 quesos.");
                nombrep = "Pizza 4 quesos";
                preciop = 75;
                ingredientesp = "queso mozzarella, queso parmesano, queso ricotta, queso provolone";
                break;
            case 4:
                System.out.println("Has elegido una pizza de Pizza Simple.");
                nombrep = "Pizza Simple";
                preciop = 50;
                ingredientesp = "queso mozzarella, salsa de tomate";
                break;
            default:
                System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                break;
        }

        Pizza sm = new Pizza( nombrep , preciop , ingredientesp);
        System.out.println(sm.obtenerDetalles());
        PizzaItaliana sm2 = new PizzaItaliana("Italiana" , 60 , "tomate");
        System.out.println(sm2.toString());
        Topping sm3 = new Topping("Queso,Peperoni,Piña,Aceitunas,Carne");
        System.out.println(sm3.toString());
        System.out.println(sm.preparPizaa());
    }
}