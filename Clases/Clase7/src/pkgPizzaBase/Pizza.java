package pkgPizzaBase;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nombre;
    private double precio;
    private List<Topping> toppings = new ArrayList<Topping>();

    public Pizza(String nombre, double precio, Topping... toppings) {
        this.nombre = nombre;
        this.precio = precio;
        for(Topping tp : toppings){
            this.toppings.add(tp);
        }
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public void removeTopping(int index){
        this.toppings.remove(index);
  }

@Override
    public String toString(){
        return "Pizza:{"+nombre+" Precio = " + precio + " Toppings = " + toppings + "}";
    }


}