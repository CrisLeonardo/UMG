package pkgPizzaBase;

public class Topping {

    private String ingrediente;

    private double precio;

    public Topping(String ingrediente, double precio) {
        this.ingrediente = ingrediente;
        this.precio = precio;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "ingrediente='" + ingrediente + '\'' +
                ", precio=" + precio +
                '}';
    }
}
