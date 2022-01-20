package e_24_matriz_simerica;

import java.util.Locale;
import java.util.Scanner;

public class E_24_matriz_simetrica {

    public static void main(String[] args) {

        int dim;
        dim = dim_valida();
        boolean no_es_antisimetrica = false;
        int[][] matriz = new int[dim][dim];
        matriz = cargar_matriz(matriz);
        no_es_antisimetrica = es_antisimetrica(no_es_antisimetrica, matriz);
        System.out.println("");
        System.out.println("Es antisimetrica?: " + !no_es_antisimetrica);
        System.out.println("");

    }
////////////////////////////////////////////////////////////

    public static int dim_valida() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int dim;
        do {
            System.out.print("Ingrese dimension de la matriz cuadrada: ");
            dim = entrada.nextInt();
            if (dim < 2 || dim > 20) {
                System.out.println("Error, ingrese valores entre 2 y 5. ");
            }
        } while (dim < 2 || dim > 20);
        return dim;
    }

    //////////////////////////////////////////////////////////////
    public static int[][] cargar_matriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Cargando matriz");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
            System.out.print("\n");
        }
        return matriz;
    }

    //////////////////////////////////////////////////////////////
    public static boolean es_antisimetrica(boolean no_es_antisimetrica, int[][] matriz) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j && matriz[i][j] != -matriz[j][i]) {
                    no_es_antisimetrica = true;
                }
            }
        }
        System.out.println("Mostrando matriz:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.printf(" [%d] ", matriz[i][j]);

            }
            System.out.print("\n");
        }
        System.out.println("");
        System.out.println("Mostrando matriz transpuesta:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (i != j) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                    System.out.printf(" [%d] ", matriz[i][j]);
                } else {
                    System.out.printf(" [%d] ", matriz[i][j]);
                }
            }
            System.out.print("\n");
        }

        return no_es_antisimetrica;
    }

    //////////////////////////////////////////////////////////////
}

/*24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa)*/
