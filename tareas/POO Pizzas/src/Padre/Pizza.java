package Padre;

public class Pizza {

    private String nombre;

    private double precio;

    private String ingredientes;

    private String preparPizaa;

    public Pizza(String nombre, double precio, String ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.preparPizaa = preparPizaa;
    }


    //constructor prepara pizza
    public Pizza(String preparPizaa) {
        this.preparPizaa = preparPizaa;
    }

    public String obtenerDetalles(){
        return "nombre: " + this.getNombre() + ", precio: " + this.getPrecio() + ", ingredientes: " + this.getIngredientes() + this.preparPizaa();
    }

    //constructor
    public String getNombre() {
        return nombre;
    }

    //constructor
    protected double getPrecio() {
        return precio;
    }

    //constructor
    private String getIngredientes() {
        return ingredientes;
    }

    //Metodo prepara pizza
    public String preparPizaa(){
        return "\nPizza lista para servir.......";
    }

    //@Override metodo que remplaza al metodo de la clase padre o superclase
    @Override
    public String toString(){ //toString es un metodo que se hereda de la clase Object y crea una cadena de texto
        return "Especialidad de la Pizza: " + this.getNombre() + ", Precio de la Pizza: " + this.getPrecio();
    }




}


