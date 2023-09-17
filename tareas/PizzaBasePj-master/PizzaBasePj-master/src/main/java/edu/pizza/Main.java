package edu.pizza;

import edu.formularios.frmPizza;
import edu.pizza.base.Pizza;
import javax.swing.*;
import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;


public class Main {
    public static void main(String[] args) {

JFrame frame = new JFrame("Pizza");
frame.setContentPane(new frmPizza().getJpanelPrincipal());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1280,720);
frame.pack();
frame.setVisible(true);


        //ejercicio 1
//        Pizza pizza = new Pizza("Pizza Margherita");
//        pizza.addTopping(new Topping("Champiñones", 1.5));
//        pizza.addTopping(new Topping("Mozzarella", 2.0));
//        pizza.addTopping(new Topping("Cebolla", 1.0));
//        pizza.addTopping(new Topping("Tomate", 1.0));
//        pizza.prepare();

        //quiten la mozarella
        //vuelvan a preparar
//        System.out.println("\nAhora sin mozarella");
//        pizza.removeTopping(1);
//        pizza.prepare();
        //pizza.prepare();










//        Ejercicio 2 heredar
//        Creamos una instancia de la clase PizzaItaliana y agregamos varios toppings
//        a ella utilizando
//        el método "agregar" de la clase Topping.
//        PizzaItaliana pizzaItaliana =
//                new PizzaItaliana("Pizza Italiana", 10.99, "Salsa de tomate", new Topping("Tomato"), new Topping("Mozzarella"), new Topping("Basil"));
//        pizzaItaliana.prepare();


//        Ejercicio 3
//        Topping pepperoni = new Topping("Pepperoni");
//        pepperoni.agregarIngrediente("queso");
//        pepperoni.agregarIngrediente("champiñones");
//        System.out.println(pepperoni); // Salida: Topping{nombre='Pepperoni', ingredientes=['queso']}


    }
}
