package Listas;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {
    public void ejemplo1() {
        List<String> taskList = new ArrayList<String>();



        String lectura = "ir a votar";
        taskList.add(lectura);
        taskList.add("Hacer compras");
        taskList.add("Pasear al perro");
        taskList.add("Lavar la ropa");
        taskList.add("Hacer la cama");
        taskList.add("Lavar los platos");



//        System.out.println(taskList);
//        String primeraTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primeraTarea);
//
//        taskList.remove(0);
//        primeraTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primeraTarea);

        int elementos = 1;
        //iterate
        //iteracion
        for (String tarea : taskList) {
            System.out.println(elementos+". Tarea: "+tarea);
            elementos ++;
        }



    }
    public void listaNumeros() {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(500);
        numeros.add(1000);
        numeros.add(1500);
        numeros.add(2000);
        numeros.add(2500);


        int suma = 0;

        for (Integer numero : numeros) {
            System.out.println("cantidad: "+numero);
            suma = suma + numero;
        }
        System.out.println("suma total: "+suma);
    }

    public void ListaTareas(){
        List<ClsTaskList> tas = new ArrayList<>();
        ClsTaskList tareaIndividual = new ClsTaskList();
        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("Comprar comida para la semana");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();


        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("Llevarlo al parque");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Lavar la ropa");
        tareaIndividual.setTaskDescription("Lavar la ropa de la semana");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("ir a votar");
        tareaIndividual.setTaskDescription("Votar por el mejor candidato");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tas.get(1).setDone(true);
        tas.get(3).setDone(true);

        int contador = 0;
        for(ClsTaskList tl : tas) {
            if(tl.isDone() == false){
                System.out.println("\n"+contador+". Tarea: "+tl.getTaskName());
                System.out.println(contador+". Descripcion: "+tl.getTaskDescription());
                System.out.println(contador+". Estado: "+tl.isDone());
            }
//            System.out.println("\n"+contador+". Tarea: "+tl.getTaskName());
//            System.out.println(contador+". Descripcion: "+tl.getTaskDescription());
//            System.out.println(contador+". Estado: "+tl.isDone());
            contador++;
        }

    }
}
