package Padre;

public class Empleado {

    private String nombre;

    private double sueldo;

   // public String direccion;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

   public String obtenerDetalles(){
        return "nombre: " + this.getNombre() + ", sueldo: " + this.getSueldo();
    }


    public String getNombre() {
        if (nombre.equals("homero")){
            this.nombre = "No homero";
        } else {
            this.nombre = nombre;
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

//    @Override
//    public String toString(){
//        return "Su es nombre: " + this.getNombre() + ", sueldo: " + this.getSueldo();
//    }
}
