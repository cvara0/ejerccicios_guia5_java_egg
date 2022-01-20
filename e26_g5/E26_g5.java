package e26_g5;

import java.util.Locale;
import java.util.Scanner;

public class E26_g5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n_c = 2, n_g = 10;
        boolean igual = false;
        int[][] mat_g = new int[n_g][n_g];
        int[][] mat_c = new int[n_c][n_c];
        int[][] posicion = new int[2][n_g];
        ///////////////////////////////////////////////

        System.out.println("Cargando matriz 1");
        System.out.println("");
        for (int i = 0; i < n_g; i++) {

            for (int j = 0; j < n_g; j++) {

                mat_g[i][j] = (int) (Math.random() * 10);
                //mat_g[i][j] =leer.nextInt();
            }
        }

        ///////////////////////////////////////////////
        System.out.println("Mostrando matriz 1");
        System.out.println("");
        for (int i = 0; i < n_g; i++) {
            for (int j = 0; j < n_g; j++) {
                System.out.print(mat_g[i][j] + "  ");
            }
            System.out.println("");
            System.out.println("");
        }
        //////////////////////////////////////////////
        System.out.println("Ingrese matriz a ubicar");
        System.out.println("");
        for (int i = 0; i < n_c; i++) {
            for (int j = 0; j < n_c; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat_c[i][j] = leer.nextInt();
            }
            System.out.println("");
        }

        //////////////////////////////////////////////////////////
        for (int i = 0; i < n_g; i++) {

            for (int j = 0; j < n_g; j++) {

                if (j + n_c <= n_g && i + n_c <= n_g && igual == false) {

                    for (int ii = 0; ii < n_c; ii++) {

                        for (int jj = 0; jj < n_c; jj++) {
                            if (mat_c[ii][jj] == mat_g[i + ii][j + jj]) {

                                posicion[0][ii] = i + ii;
                                posicion[1][jj] = j + jj;

                                igual = true;
                            } else {

                                ii = n_c;
                                jj = n_c;
                                igual = false;
                            }

                        }
                    }
                }
            }
        }

        if (igual == false) {

            System.out.println("No se encontro la matriz.");

        } else {
            System.out.println("Se encontro la primer matriz:");
            for (int i = 0; i < n_g; i++) {

                for (int j = 0; j < n_g; j++) {

                    for (int i2 = 0; i2 < n_c; i2++) {
                        for (int j2 = 0; j2 < n_c; j2++) {

                            if (i == posicion[0][i2] && j == posicion[1][j2]) {

                                System.out.print("[" + mat_g[i][j] + "]");
                                j++;
                            }
                        }
                    }
                    if (j < n_g) {
                        System.out.print(" " + mat_g[i][j] + " ");
                    }
                }
                System.out.println("");
            }
        }
/////////////////////////////////////////////////////////

    }

}

/*26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.*/
