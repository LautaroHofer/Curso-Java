// pedirle al usuario que ingrese 2 valores numericos y que se pueda hacer una operacion.
// Si A es mayor que B entonces asignar *. Si A es menor que B entonces se asigna /. Si A y B son igual se asigna +.
// y el resultado de cada caso se guarda en la variable A.

import java.util.Scanner;

public class OperacionesNumericas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer valor numérico (A):");
        double a = scanner.nextDouble();
        System.out.println("Ahora ingrese el segundo valor numérico (B):");
        double b = scanner.nextDouble();
        char operador;
        if (a > b) {
            operador = '*';
            a = a * b; 
        } else if (a < b) {
            operador = '/';
            if (b != 0) {
                a = a / b; 
            } else {
                System.out.println("Error: No se puede dividir por cero.");
                return; 
            }
        } else {
            operador = '+';
            a = a + b; 
        }
        System.out.println("El resultado de la operación se ha guardado en A, y su nuevo valor es: " + a);
        scanner.close();
    }
}