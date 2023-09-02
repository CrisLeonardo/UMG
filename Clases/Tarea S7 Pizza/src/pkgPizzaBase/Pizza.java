package pkgPizzaBase;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nombre;
    private double precio;
    private List<Topping> toppings;

    public Pizza(String nombre, double precio, List<Topping> toppings) {
        this.nombre = nombre;
        this.precio = precio;
        this.toppings = new ArrayList<>(toppings);
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public void removeTopping(int index){
        if (index >= 0 && index < toppings.size()) {
            this.toppings.remove(index);
        }
    }
    public double calcularPrecioTotal() {
        double precioTotal = precio; // Comenzamos con el precio base de la pizza

        // Sumamos los precios de los toppings
        for (Topping topping : toppings) {
            precioTotal += topping.getPrecio();
        }

        return precioTotal;
    }



    @Override
    public String toString(){
        return "Pizza: {"+nombre+" Precio = " + precio + "}" + " \nToppings = " + toppings.toString() ;
    }
}
