import pkgPizzaBase.Pizza;
import pkgPizzaBase.Topping;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Hawaiana", 100,
                List.of(new Topping("Piña", 10), new Topping("Jamon", 15)));
        System.out.println(pizza);

        System.out.println("Precio total de la pizza: " + pizza.calcularPrecioTotal());


    }
}