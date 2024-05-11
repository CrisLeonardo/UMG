package org.example.Pilas.evaluacion;
import org.example.Pilas.PilaLineal;
public class Aritmetica {

    //evaluar una expresión aritmética
    public static int evaluar(String expresion) throws Exception {
        PilaLineal operandos = new PilaLineal();
        PilaLineal operadores = new PilaLineal();
        int resultado = 0;
        int operando1, operando2;
        char operador;
        int i = 0;

        // Recorre la cadena de la expresión
        while (i < expresion.length()) {
            // Verifica si el carácter actual es un espacio en blanco y lo ignora
            if (expresion.charAt(i) == ' ') {
                i++;
            }
            // Si el carácter es un operador, lo inserta en la pila de operadores
            else if (expresion.charAt(i) == '+' || expresion.charAt(i) == '-' || expresion.charAt(i) == '*' || expresion.charAt(i) == '/') {
                operadores.insertar(expresion.charAt(i));
                i++;
            }
            // Si el carácter es un dígito, forma un número y lo inserta en la pila de operandos
            else {
                String numero = "";
                while (i < expresion.length() && expresion.charAt(i) != ' ' && expresion.charAt(i) != '+' && expresion.charAt(i) != '-' && expresion.charAt(i) != '*' && expresion.charAt(i) != '/') {
                    numero += expresion.charAt(i);
                    i++;
                }
                operandos.insertar(Integer.parseInt(numero));
            }
        }

        // Realiza la evaluación de la expresión mientras haya operadores en la pila de operadores
        while (!operadores.pilaVacia()) {
            try {
                // Extrae dos operandos y un operador de las pilas
                operando2 = (int) operandos.quitar();
                operando1 = (int) operandos.quitar();
                operador = (char) operadores.quitar();
                // Realiza la operación correspondiente y guarda el resultado en la pila de operandos
                switch (operador) {
                    case '+':
                        resultado = operando1 + operando2;
                        break;
                    case '-':
                        resultado = operando1 - operando2;
                        break;
                    case '*':
                        resultado = operando1 * operando2;
                        break;
                    case '/':
                        resultado = operando1 / operando2;
                        break;
                }
                operandos.insertar(resultado);
            }
            // Maneja excepciones en caso de operaciones inválidas
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Retorna el resultado final de la evaluación de la expresión
        return resultado;
    }

}
