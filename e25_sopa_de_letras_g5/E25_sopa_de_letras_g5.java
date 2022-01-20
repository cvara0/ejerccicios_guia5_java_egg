package e25_sopa_de_letras_g5;

import java.util.Locale;
import java.util.Scanner;

public class E25_sopa_de_letras_g5 {

    public static void main(String[] args) {

        String[] palabras;
        char[][] matriz;
        int[] posiciones;

        System.out.println("Ingrese 5 palabras\nde entre 3 y 5 caracteres:");
        System.out.println("");
        palabras = ingresar_palabras();//devuelve vector con 5 palabras validas
        System.out.println("");
        matriz = crear_matriz_letras();//devuelve matriz llena de letras o en este caso nros aleatorios del 0 al 9
        System.out.println("");
        posiciones = reservar_posiciones_filas(palabras, matriz);//devuelve un vector con las posiciones de filas sin repetir
        agregar_a_matriz(palabras, matriz, posiciones);//combina palabras ingresadas con la amtriz generada para crear la sopa
        mostrar_matriz(matriz);

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

    public static char[][] crear_matriz_letras() {
        int m = 10;

        char[][] matriz = new char[m][m];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m; j++) {
                matriz[i][j] = (char) ((Math.random() * 9) + 48);//nros aleatorios entre 48 y 57 (48+9) correspondientes desde el 0 al 9 en codigo ascii
            }
        }
        return matriz;
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    public static int[] reservar_posiciones_filas(String[] palabras, char[][] matriz) {
       
        int[] posicion_fila = new int[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            posicion_fila[i] = (int) (Math.random() * (matriz.length - 1));//se reservan posiciones de filas aleatoriamente
            for (int j = 0; j < i; j++) {

                if (posicion_fila[i] == posicion_fila[j]) {//se cuida que estas posiciones no se repitan(experimental)
                    j = i;
                    i--;
                }
            }
        }
        /*for (int i = 0; i < palabras.length; i++) {
            //prueba de posiciones
            System.out.print( posicion_fila[i]+",");
        }*/
        return (posicion_fila);
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    public static void agregar_a_matriz(String[] palabras, char[][] matriz, int[] posiciones_filas) {
    
        for (int i = 0; i < palabras.length; i++) {
            int j_inicial = (int) (Math.random() * (matriz.length - palabras[i].length()));
            for (int j = 0; j < palabras[i].length(); j++) {
                            
                if (posiciones_filas[i] % 2 == 0) {//aleatoriamente se ponen algunas palabras alreves
                    matriz[posiciones_filas[i]][j + j_inicial] = palabras[i].charAt(j);
                } else {
                    matriz[posiciones_filas[i]][j + j_inicial] = palabras[i].charAt(palabras[i].length() - j - 1);
                }
            }
        }
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
