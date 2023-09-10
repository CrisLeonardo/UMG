package org.edu;
import org.edu.pizza.Interfaces.PizzaBase;
import org.edu.pizza.base.Pizza;
import org.edu.pizza.base.Topping;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double size = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la pizza: \n 1. Pequeña \n 2. Mediana \n 3. Grande");
        int opcion = scanner.nextInt();
        Pizza pizza = null; // Declarar la variable fuera del switch para que sea accesible en todos los casos

        switch(opcion){
            case 1:
size = 0;
                System.out.println("Has elegido una pizza pequeña\nElige que clase de pizza quieres: " +
                        "\n 1. Pizza Italiana \n 2. Pizza Americana \n 3. Pizza Mexicana \n 4. Pizza Vegetariana");
                int opcion2 = scanner.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("Has elegido una pizza italiana");
                        pizza = new Pizza("Pizza Italiana", 12.5, "Tomato sauce",size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.prepare();
                        break;
                    case 2:
                        System.out.println("Has elegido una pizza americana");
                        pizza = new Pizza("Pizza Americana", 11.5, "Salsa BBQ", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chuletitas con BBQ", 3.5));
                        pizza.prepare();
                        break;
                    case 3:
                        System.out.println("Has elegido una pizza mexicana");
                        pizza = new Pizza("Pizza Mexicana", 10.5, "Salsa Picante", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chile jalapeño", 1.5));
                        pizza.prepare();
                        break;
                    case 4:
                        System.out.println("Has elegido una pizza vegetariana");
                        pizza = new Pizza("Pizza Mexicana", 15.5, "Salsa clasic",   size);
                        pizza.addTopping(new Topping("Peperoni de plastico", 3.5));
                        pizza.addTopping(new Topping("Queso mozzarella de plastico",    5.5));
                        pizza.addTopping(new Topping("arbolitos", 3.5));
                        pizza.addTopping(new Topping("Hongos Magicos", 10.5));
                        pizza.prepare();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                        break;
                }

                break;
            case 2:
                size = 0.2;
                System.out.println("Has elegido una pizza mediana\nElige que clase de pizza quieres: " +
                        "\n 1. Pizza Italiana \n 2. Pizza Americana \n 3. Pizza Mexicana \n 4. Pizza Vegetariana");
                int opcion3 = scanner.nextInt();
                switch (opcion3){
                    case 1:
                        System.out.println("Has elegido una pizza italiana");
                        pizza = new Pizza("Pizza Italiana", 12.5, "Tomato sauce",size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.prepare();
                        break;
                    case 2:
                        System.out.println("Has elegido una pizza americana");
                        pizza = new Pizza("Pizza Americana", 11.5, "Salsa BBQ", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chuletitas con BBQ", 3.5));
                        pizza.prepare();
                        break;
                    case 3:
                        System.out.println("Has elegido una pizza mexicana");
                        pizza = new Pizza("Pizza Mexicana", 10.5, "Salsa Picante", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chile jalapeño", 1.5));
                        pizza.prepare();
                        break;
                    case 4:
                        System.out.println("Has elegido una pizza vegetariana");
                        pizza = new Pizza("Pizza Mexicana", 15.5, "Salsa clasic",   size);
                        pizza.addTopping(new Topping("Peperoni de plastico", 3.5));
                        pizza.addTopping(new Topping("Queso mozzarella de plastico",    5.5));
                        pizza.addTopping(new Topping("arbolitos", 3.5));
                        pizza.addTopping(new Topping("Hongos Magicos", 10.5));
                        pizza.prepare();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                        break;
                }

                break;
            case 3:
                size = 0.35;
                System.out.println("Has elegido una pizza grande\nElige que clase de pizza quieres: " +
                        "\n 1. Pizza Italiana \n 2. Pizza Americana \n 3. Pizza Mexicana \n 4. Pizza Vegetariana");
                int opcion4 = scanner.nextInt();
                switch (opcion4){
                    case 1:
                        System.out.println("Has elegido una pizza italiana");
                        pizza = new Pizza("Pizza Italiana", 12.5, "Tomato sauce",size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.prepare();
                        break;
                    case 2:
                        System.out.println("Has elegido una pizza americana");
                        pizza = new Pizza("Pizza Americana", 11.5, "Salsa BBQ", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chuletitas con BBQ", 3.5));
                        pizza.prepare();
                        break;
                    case 3:
                        System.out.println("Has elegido una pizza mexicana");
                        pizza = new Pizza("Pizza Mexicana", 10.5, "Salsa Picante", size);
                        pizza.addTopping(new Topping("Peperoni", 2.5));
                        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
                        pizza.addTopping(new Topping("Jamon", 2.5));
                        pizza.addTopping(new Topping("Chile jalapeño", 1.5));
                        pizza.prepare();
                        break;
                    case 4:
                        System.out.println("Has elegido una pizza vegetariana");
                        pizza = new Pizza("Pizza Mexicana", 15.5, "Salsa clasic",   size);
                        pizza.addTopping(new Topping("Peperoni de plastico", 3.5));
                        pizza.addTopping(new Topping("Queso mozzarella de plastico",    5.5));
                        pizza.addTopping(new Topping("arbolitos", 3.5));
                        pizza.addTopping(new Topping("Hongos Magicos", 10.5));
                        pizza.prepare();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                break;
        }

//System.out.println("this is the salsa: "+pizza.getSalsa());

//        PizzaBase pizza = new PizzaBase("Pizza Italiana", 12.5);
//
//        pizza.prepare();



    }
}