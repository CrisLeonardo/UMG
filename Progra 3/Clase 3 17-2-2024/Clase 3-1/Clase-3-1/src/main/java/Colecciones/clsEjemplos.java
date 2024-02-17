package Colecciones;
import java.util.*;
import java.util.stream.Collectors;
public class clsEjemplos {

    public void ejemplo1() {
        String[] arreglo = {"jose", "maria", "pedro", "juan"};

        // Crear una nueva lista mutable y agregar todos los elementos del arreglo
        List<String> miLista = new ArrayList<>(Arrays.asList(arreglo));

        // Ordenar la lista
        Collections.sort(miLista);
        System.out.println("Ordenado: " + miLista);

        // Buscar un dato
        int donde = Collections.binarySearch(miLista, "pedro");
        System.out.println("Pedro está en la posición: " + donde);

        // Revolver
        Collections.shuffle(miLista);
        System.out.println("Aleatorio: " + miLista);

        // Reversa
        Collections.reverse(miLista);
        System.out.println("Reversa: " + miLista);

        // Agregar dato
        miLista.add("luis");
        System.out.println("LLenando: " + miLista);
    }

    public void ejemplo2_lista() {
        List<String> lista = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        lista2.add("esta");
        lista2.add("es");
        lista2.add("una prueba");
        lista.add("hola");
        lista.add("adios");


        lista.add("ciao");
        lista.add("bye");
        //agregar un elemento en una posicion especifica
        lista.add(2, "bye");

//iterar en los elementos de la lista usando for
        for (String elemento : lista2) {
            System.out.println("Datos lista2=" + elemento);
        }

//obtener elementos en base a su indice
        System.out.println(lista.size()); // Devuelve 5
        System.out.println(lista.get(0)); // Devuelve hola
        System.out.println(lista.get(1)); // Devuelve adios
        System.out.println(lista.get(2)); // Devuelve bye
        System.out.println(lista.get(3)); // Devuelve ciao
        System.out.println(lista.get(4)); // Devuelve bye

        //iterar lista completa
        for (String v : lista)
            System.out.print(v); // Imprime: holaadiosbyeciaobye
        for (int i = 0; i < lista.size(); i++) {
            String v = lista.get(i);
            System.out.print(v);
        } // Imprime: holaadiosbyeciaobye

        //importante: esto usa el iterator para recorrer los elementos de la lista
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String v = it.next();
            System.out.print(v);
        }

    }
}
