package e6_g5;

import java.util.Locale;
import java.util.Scanner;

public class E6_g5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nro1, nro2;

        System.out.print("Ingrese primer nro.:");
        nro1 = leer.nextInt();
        System.out.print("");
        System.out.print("Ingrese segundo nro.: ");
        nro2 = leer.nextInt();
        System.out.println("");

        if (nro1 == nro2) {
            System.out.print("Ambos nros. son iguales");
        } else if (nro1 > nro2) {
            System.out.print("El mayor es: " + nro1);
        } else {
            System.out.print("El mayor es: " + nro2);
        }
        System.out.println("");
    }
    
}

/*6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
