package Nieto;
import Padre.Pizza;
public class Topping {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        System.out.println("Agregando topping " + nombre + " a la pizza " + pizza.toString());
    }

    @Override
    public String toString() {
        return "Toppgin de la pizza: " + nombre; // Suponiendo que "nombre" es una propiedad de la clase Pizza
    }

}
