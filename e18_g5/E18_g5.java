package e18_g5;

import java.util.Locale;
import java.util.Scanner;

public class E18_g5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        byte nro = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, mayor = 0;

        System.out.println("Ingrese 4 nros.");

        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("[" + (i + 1) + "]: ");
                nro = leer.nextByte();
                if (nro < 1 || nro > 20) {
                    System.out.println("Error. Ingrese nro. entre 1 y 20");
                }
            } while (nro < 1 || nro > 20);

            if (i == 0) {
                mayor = nro;
            } else if (nro > mayor) {
                mayor = nro;
            }

            switch (i) {
                case 0:
                    n1 = nro;
                    break;
                case 1:
                    n2 = nro;
                    break;
                case 2:
                    n3 = nro;
                    break;
                case 3:
                    n4 = nro;
                    break;
            }

        }
        System.out.println();
        System.out.print(n1 + " ");
        for (int i = 0; i < n1; i++) {

            System.out.print("*");

        }
        System.out.println();
        System.out.print(n2 + " ");
        for (int i = 0; i < n2; i++) {

            System.out.print("*");

        }
        System.out.println();
        System.out.print(n3 + " ");
        for (int i = 0; i < n3; i++) {

            System.out.print("*");

        }
        System.out.println();
        System.out.print(n4 + " ");
        for (int i = 0; i < n4; i++) {

            System.out.print("*");

        }
        System.out.println();

    }

}

/*18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ***/
