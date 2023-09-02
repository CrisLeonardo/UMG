package org.edu;
import org.edu.pizza.Interfaces.PizzaBase;
import org.edu.pizza.base.Pizza;
import org.edu.pizza.base.Topping;
import org.edu.pizza.especialidades.PizzaItaliana;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PizzaItaliana pizza = new PizzaItaliana("Pizza Italiana", 12.5, "Tomato sauce");
        pizza.addTopping(new Topping("Peperoni", 2.5));
        pizza.addTopping(new Topping("Queso mozzarella",    3.5));
        pizza.addTopping(new Topping("Jamon", 2.5));
        pizza.prepare();
//System.out.println("this is the salsa: "+pizza.getSalsa());

//        PizzaBase pizza = new PizzaBase("Pizza Italiana", 12.5);
//
//        pizza.prepare();



    }
}