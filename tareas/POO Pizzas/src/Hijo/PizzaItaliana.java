package Hijo;

import Padre.Pizza;

public class PizzaItaliana extends Pizza {

    //declaracion de variable privada
    private String salsa;

    public String getSalsa() {

        return salsa;
    }

    //constructor
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public PizzaItaliana(String nombre, double precio, String sla){
        super(nombre, precio, sla);
        this.salsa = sla;
    }

    //@Override metodo que remplaza al metodo de la clase padre o superclase
@Override
public String toString(){ //toString es un metodo que se hereda de la clase Object y crea una cadena de texto
    return "Especialidad de la Pizza: " + this.getNombre() + ", Precio de la Pizza: " + this.getPrecio() + ", Salsa: " + this.getSalsa();
}
}
