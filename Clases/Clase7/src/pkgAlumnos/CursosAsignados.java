package pkgAlumnos;
import java.util.ArrayList;
import java.util.*;
public class CursosAsignados extends ArrayList<Curso> {

   private List<Curso> cursos;

   public CursosAsignados(){
       super();
       this.cursos = new ArrayList<>();
   }

   @Override
    public boolean add(Curso curso){
        if (!this.cursos.contains(curso)){
            this.cursos.add(curso);
            return true;
        }else {
            return false;
        }
   }

   @Override
    public boolean contains(Object o){
        return this.cursos.stream().anyMatch((curso) -> (curso== null ? o == null : curso.equals(o)));
   }

   @Override
    public Iterator<Curso> iterator(){
        return this.cursos.iterator();
   }

   @Override
    public int size(){
        return this.cursos.size();
   }

   @Override
    public Curso get (int index){
        return this.cursos.get(index);
   }

    @Override
    public void clear() {
        this.cursos.clear();
    }
}
