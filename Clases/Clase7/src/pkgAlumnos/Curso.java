package pkgAlumnos;

public class Curso {

    public String codigo;

    public String nombre;

    public double costo;





    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }



    public Curso(String codigo, String nombre, double costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;

    }


}
