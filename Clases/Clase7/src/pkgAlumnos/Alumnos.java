package pkgAlumnos;
import java.util.ArrayList;
import java.util.List;
public class Alumnos {

    private String carnet;
    private String nombre;

    private String telefono;

    private String direccion;

    private List<Curso> cursos;

    private double total;

    //constructor

    public Alumnos(String carnet, String nombre, String telefono, String direccion, List<Curso> cursos, double total) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
        this.total = total;
    }

public void agregarCurso(Curso curso){
        this.cursos.add(curso);
}
    //getter and seters


    public void setTotal(double total) {
        this.total = total;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public double total(){
        double total = 0;
        for (Curso curso : this.cursos) {
            total = total + curso.getCosto();
        }
        return total;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }


}
