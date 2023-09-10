package org.edu.pizza.base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Pizza {

    private String name;

    //convertir el price en una funcion que me retorne el valor de la pizza en base a sis ingredientes.

    private double price;

    private double psize;

    private String salsa;

    private double precioTotal;
    private List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, double price,String salsa, Double psize, Topping... toppings) {
        this.name = name;
        this.price = price;
        this.salsa = salsa;
        this.psize = psize;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getName() {
        return name;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrice() {
        return price;
    }

    public double getPsize() {
        return psize;
    }

    public void setPsize(double psize) {
        this.psize = psize;
    }



    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + "Salsa="+salsa+",Size="+psize+", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        double total = 0;
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + "   Precio: " + topping.getPrecio());

            total = total + topping.getPrecio();
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        psize = price * psize;
        total = total + price + psize;
        System.out.println("The Pizza is ready!" + "\nTotal a pagar: " + total);
    }
}
