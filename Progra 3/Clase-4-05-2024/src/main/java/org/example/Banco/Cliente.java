package org.example.Banco;
import java.util.Random;
import java.util.logging.Level;
public class Cliente {

    private String nombre;
    private int tiempoAtencion; //tiempo en minutos que le tomara atender al cliente

    //contructor, obtiene el nombre del cliente y genera un numero aleatorio
    //simulando los minutos que tomara atenderlo

    public Cliente(String nombre){
        this.nombre = nombre;
        Random rand = new Random();
        this.tiempoAtencion = rand.nextInt(10) + 1;
    }
    public String getNombre(){return nombre;}
    public int getTiempoAtencion(){return tiempoAtencion;}
    @Override
    public String toString(){
        return "Cliente {nombre: "+nombre+", Tiempo Atencion: "+tiempoAtencion+" minutos}";
    }


}
