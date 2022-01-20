package e25_g5;

import java.util.Locale;
import java.util.Scanner;

public class E25_g5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 3;
        int[][] matriz = new int[n][n];
        int suma_primer_fila = 0, suma_fila = 0,suma_columna = 0, suma_diagonal_1 = 0, suma_diagonal_2 = 0;
        System.out.println("Cargando matriz");
        System.out.println("");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                do {
                    System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = leer.nextInt();

                    if (matriz[i][j] < 1 || matriz[i][j] > 50) {
                        System.out.println("Error, ingrese nros. del 1 al 50");
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 50);

            }

            System.out.println("");
        }
        ///////////////////////////////////////////////////////////////
        for (int i = 0; i < n; i++) { 

            suma_primer_fila = (suma_primer_fila + matriz[0][i]);
            suma_diagonal_1 = (suma_diagonal_1 + matriz[i][i]);
            suma_diagonal_2 = (suma_diagonal_2 + matriz[n - 1 - i][i]);

            for (int j = 0; j < n; j++) {

                suma_fila = suma_fila+ matriz[i][j];
                suma_columna=suma_columna+ matriz[j][i];

            }

        }
        ///////////////////////////////////////////////////////////////
        if (suma_primer_fila != suma_diagonal_1 || suma_primer_fila != suma_diagonal_2 || suma_primer_fila!=(suma_fila/n) || suma_primer_fila!=(suma_columna/n)){
            System.out.println("No es magica!!");

        } else {

            System.out.println("Es magica, y la suma es: " + suma_primer_fila);
            
        }
    }

}

/*25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

Declaración y creación de una Matriz
tipo[][] arregloM = new tipo[Filas][Columnas];

 */
