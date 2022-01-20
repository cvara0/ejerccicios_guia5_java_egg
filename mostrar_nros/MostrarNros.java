package mostrar_nros;

import java.util.Locale;
import java.util.Scanner;

public class MostrarNros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        byte n = 10, nro;
        byte[][] matriz = new byte[n][n];

        cargar_matriz(n, matriz);
        mostrar_matriz(n, matriz);
        do {
            System.out.print("Ingrese nro. a mostrar\n(negativo para salir): ");
            nro = leer.nextByte();
            System.out.println("");
            mostrar_nro(n, matriz, nro);
        } while (nro > -1);
        System.out.println("Fin");
    }

    ///////////////////////////////////////////////////////////
    public static void cargar_matriz(byte n, byte[][] matriz) {

        System.out.println("Cargando matriz");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matriz[i][j] = (byte) (Math.random() * 10);
            }
        }
    }

    //////////////////////////////////////////////////////////
    public static void mostrar_matriz(byte n, byte[][] matriz) {

        System.out.println("mostrando matriz");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //////////////////////////////////////////////////////////
    public static void mostrar_nro(byte n, byte[][] matriz, byte nro) {

        System.out.println("mostrando nro.");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] == nro) {
                    System.out.print(" " + nro + " ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }

    //////////////////////////////////////////////////////////
}
