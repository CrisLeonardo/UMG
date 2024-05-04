package org.example.Banco;
import java.util.Queue;
import java.util.LinkedList;

public class ColaBanco {

    private Queue<Cliente> filaClientes;
    private int capacidadMaxima;
    public ColaBanco(int MaxCapacity){
        this.filaClientes = new LinkedList<>();
        this.capacidadMaxima = MaxCapacity;
    }

    public void agregarCliente(Cliente cliente){
        if(filaClientes.size()<capacidadMaxima){
            filaClientes.offer(cliente);
            System.out.println("Cliente "+cliente.getNombre()+" se ha unido a la fila");

        } else {
            System.out.println("lo lamento la fila ya esta llena, vaya a la calle");
        }
    }

    public Cliente atenderSiguienteCliente(){
        if(!filaClientes.isEmpty()){
            Cliente clienteAtendido = filaClientes.poll();
            System.out.println("Cliente: "+clienteAtendido.getNombre());
            return clienteAtendido;
        } else {
            System.out.println("No hay clientes en la fila");
            return null;
        }
    }
    public int cantidadClientesEnFila(){
        return filaClientes.size();
    }

}
