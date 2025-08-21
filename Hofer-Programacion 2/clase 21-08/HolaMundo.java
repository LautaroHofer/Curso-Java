import java.util.Scanner;

public class HolaMundo {
    public static void main (String[] org) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Hola Mundo");
        String nombre = scan.nextLine ();
        System.out.println ("Hola" + nombre);
    }
}
  