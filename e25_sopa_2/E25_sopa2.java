package e25_sopa_2;

import java.util.Locale;
import java.util.Scanner;

public class E25_sopa2 {

    public static void main(String[] args) {

        String[] palabras;
        int[] posiciones_filas;
        int dim_matriz = 20;
        System.out.println("Ingrese 5 palabras\nde entre 3 y 5 caracteres:");
        System.out.println("");
        palabras = ingresar_palabras();//devuelve vector con 5 palabras validas
        System.out.println("");
        posiciones_filas = reservar_posiciones_filas(palabras, dim_matriz);//devuelve un vector con las posiciones de filas sin repetir
        crear_matriz_sopa(palabras, posiciones_filas, dim_matriz);//combina palabras ingresadas con la amtriz generada para crear la sopa
        System.out.println("");
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    public static String[] ingresar_palabras() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n = 5;
        String[] palabras = new String[n];

        for (int i = 0; i < n; i++) {

            do {
                System.out.print("[" + (i + 1) + "]: ");
                palabras[i] = entrada.next();
                palabras[i] = palabras[i].toUpperCase();

                if (palabras[i].length() < 3 || palabras[i].length() > 5) {
                    System.out.println("Error, ingrese palabras\nde entre 3 y 5 caracteres.");
                }
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
        }
        return (palabras);
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    public static int[] reservar_posiciones_filas(String[] palabras, int dim_matriz) {

        int[] posicion_fila = new int[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            posicion_fila[i] = (int) (Math.random() * (dim_matriz - 1));//se reservan posiciones de filas aleatoriamente
            for (int j = 0; j < i; j++) {

                if (posicion_fila[i] == posicion_fila[j]) {//se cuida que estas posiciones no se repitan(experimental)
                    j = i;
                    i--;
                }
            }
        }
        return (posicion_fila);
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    public static void crear_matriz_sopa(String[] palabras, int[] posiciones_filas, int dim_matriz) {

        char[][] matriz_sopa = new char[dim_matriz][dim_matriz];

        for (int i = 0; i < palabras.length; i++) {
            int j_inicial = (int) (Math.random() * (dim_matriz - palabras[i].length()));//posicion inicial de las palabras ingresadas
            for (int j = 0; j < palabras[i].length(); j++) {

                if (posiciones_filas[i] % 2 == 0) {//aleatoriamente se ponen algunas palabras alreves
                    matriz_sopa[posiciones_filas[i]][j + j_inicial] = palabras[i].charAt(j);

                } else {
                    matriz_sopa[posiciones_filas[i]][j + j_inicial] = palabras[i].charAt(palabras[i].length() - j - 1);
                }
            }
        }
        for (int i = 0; i < dim_matriz; i++) {

            for (int j = 0; j < dim_matriz; j++) {
                if (matriz_sopa[i][j] == '\0') {//los lugares nulos ('\0' para variables de tipo char) se rellenan con nros aleatorios
                    matriz_sopa[i][j] = (char) ((Math.random() * 9) + 48);
                }
            }
        }
        mostrar_matriz(matriz_sopa);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public static void mostrar_matriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////
}

/*23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.*/
