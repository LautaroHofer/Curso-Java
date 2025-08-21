import java.util.Scanner;

public class OperacionesNumericas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer valor numérico (A):");
        double a = scanner.nextDouble();
        System.out.println("Ahora ingrese el segundo valor numérico (B):");
        double b = scanner.nextDouble();
        char operador;
        a = (a>b)? (a*b):((a<b)?(b/a):(a+b)); //se separa por terminos y el : realiza la funcion del else.
    }
}