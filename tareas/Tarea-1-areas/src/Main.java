// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Seleccione la opcion del area que quiere calcular de las siguientes figuras\n");

        String[] opciones = {"Circulo","Triangulo","Rectangulo","Cuadrado"};

        System.out.printf("Objetos disponibles para calcular el area: \n");
        for (int i = 0; i < opciones.length; i++){
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una de las opciones (1-" + opciones.length + "):");
        int opc = scanner.nextInt();

        if (opc >= 1 && opc <= opciones.length) {

            String opcioneselegida = opciones[opc - 1];

            switch (opcioneselegida) {
                case "Circulo":
                    System.out.println("Elegiste calcular un circulo\nDame el radio de dicho circulo para calcular su area: ");
                    int radio = scanner.nextInt();
                    float areacirculo = 3.1416f * (radio * radio);
                    System.out.println("El Area de tu circulo es de: " + areacirculo);
                    break;

                case "Triangulo":
                    System.out.println("Elegiste calcular un Triangulo\nDame la base y la altura de dicho Triangulo para calcular su area.");
                    System.out.println("Base: ");
                    int Base = scanner.nextInt();
                    System.out.println("Altura: ");
                    int Altura = scanner.nextInt();
                    float areatriangulo = (Base * Altura)/2;
                    System.out.println("El Area de tu Triangulo es de: " + areatriangulo);
                    break;

                case "Rectangulo":
                    System.out.println("Elegiste calcular un Triangulo\nDame la base y la altura de dicho Rectangulo para calcular su area.");
                    System.out.println("Base: ");
                    int BaseRectangulo = scanner.nextInt();
                    System.out.println("Altura: ");
                    int AlturaRectangulo = scanner.nextInt();
                    float areaRectangulo = BaseRectangulo * AlturaRectangulo;
                    System.out.println("El Area de tu Rectangulo es de: " + areaRectangulo);
                    break;

                case "Cuadrado":
                    System.out.println("Elegiste calcular un Cuadrado\nDame el lado de dicho Cuadrado para calcular su area.");
                    System.out.println("Lado: ");
                    int Lado = scanner.nextInt();
                    float areaCuadrado = Lado * Lado;
                    System.out.println("El Area de tu Cuadrado es de: " + areaCuadrado);
                    break;

            }
        } else {
            System.out.println("Ingresaste una opcion no valida.");
        }
        scanner.close();
    }
}