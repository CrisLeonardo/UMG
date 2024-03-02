package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        // Crear una lista de palabras
        List<String> palabras = Arrays.asList("Guatemala", "es", "muy", "bonita", "y", "divertida");

        // Crear un stream a partir de la lista de palabras
        Stream<String> streamDePalabras = palabras.stream();

        // Filtrar las palabras que tienen longitud mayor que 2
        Stream<String> palabrasFiltradas = streamDePalabras.filter(palabra -> palabra.length() > 2);

        // Imprimir las palabras filtradas
        System.out.println("Palabras filtradas:");
        palabrasFiltradas.forEach(System.out::println);

        // Crear un nuevo stream de palabras
        Stream<String> nuevoStreamDePalabras = palabras.stream();

        // Obtener la longitud de cada palabra y recoger los resultados en una lista
        List<Integer> longitudes = nuevoStreamDePalabras.map(String::length)
                .collect(Collectors.toList());

        // Imprimir las longitudes de las palabras
        System.out.println("Longitudes de las palabras:");
        longitudes.forEach(System.out::println);

        // Crear un nuevo stream de palabras
        Stream<String> otroStreamDePalabras = palabras.stream();

        // Recoger las palabras en una lista
        List<String> listaDePalabras = otroStreamDePalabras.collect(Collectors.toList());

        // Imprimir la lista de palabras
        System.out.println("Lista de palabras:");
        listaDePalabras.forEach(System.out::println);

        // Crear un stream de números
        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);

        // Calcular la suma de los números
        Optional<Integer> suma = numeros.reduce(Integer::sum);

        // Imprimir la suma de los números
        System.out.println("La suma de los números es: " + suma.orElse(0));

        // Operación de Ordenamiento
        Stream<String> palabrasOrdenadas = palabras.stream()
                .sorted();
        System.out.println("Palabras ordenadas:");
        palabrasOrdenadas.forEach(System.out::println);

        // Operación de Mapeo y Filtrado Adicional
        Stream<String> palabrasMayusculasFiltradas = palabras.stream()
                .map(String::toUpperCase)
                .filter(palabra -> palabra.startsWith("G"));
        System.out.println("Palabras en mayúsculas que empiezan con 'G':");
        palabrasMayusculasFiltradas.forEach(System.out::println);

        // Operación de Limitación
        Stream<String> palabrasLimitadas = palabras.stream()
                .limit(3);
        System.out.println("Primeras tres palabras:");
        palabrasLimitadas.forEach(System.out::println);



        // Operación de Concatenación de Streams
        List<String> otrasPalabras = Arrays.asList("programación", "es", "divertida");
        Stream<String> streamDeOtrasPalabras = otrasPalabras.stream();

        Stream<String> streamConcatenado = Stream.concat(palabras.stream(), streamDeOtrasPalabras);
        System.out.println("Stream concatenado:");
        streamConcatenado.forEach(System.out::println);
            }
        }

