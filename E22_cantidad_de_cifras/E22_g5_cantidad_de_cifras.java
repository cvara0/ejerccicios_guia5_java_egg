package E22_cantidad_de_cifras;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cvara
 */
public class E22_g5_cantidad_de_cifras {

    public static void main(String[] args) {
        int dimension;
        do {
            System.out.print("ingrese dimension del vector (min 2,max 10):");
            dimension = ingreso_nro_valido();
            if ((dimension < 2 || dimension > 10)) {
                System.out.println("Error.\n");
            }
        } while (dimension < 2 || dimension > 10);
        int[] vector = new int[dimension];

        cargar_vector(vector, dimension);

        contar_digitos(vector, dimension);

    }
///////////////cargar vector//////////////////

    public static void cargar_vector(int[] vector, int dimension) {

        System.out.println("ingrese nros. del vector (max 5 digitos):");
        for (int i = 0; i < dimension; i++) {
            do {
                System.out.print("[" + (i + 1) + "]: ");
                vector[i] = ingreso_nro_valido();
                if ((Integer.toString(vector[i])).length() < 1 || (Integer.toString(vector[i])).length() > 5) {
                    System.out.println("Error. max 5 digitos.");
                }
            } while ((Integer.toString(vector[i])).length() < 1 || (Integer.toString(vector[i])).length() > 5);

        }

    }
    //////////////ingreso_nro_valido//////////////////

    public static int ingreso_nro_valido() {
        String nro_string;
        int nro_int = 0;
        boolean valido;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        do {
            valido = true;
            nro_string = leer.next();
            try {
                nro_int = Integer.parseInt(nro_string);
            } catch (NumberFormatException e) {
                System.out.print("Error. Ingrese nro. valido: ");
                valido = false;
            }

        } while (valido == false);
        return (nro_int);

    }

    //////////////contar_digitos//////////////////
    public static void contar_digitos(int[] vector, int dimension) {
        int digit_1 = 0, digit_2 = 0, digit_3 = 0, digit_4 = 0, digit_5 = 0;
        for (int i = 0; i < vector.length; i++) {
            switch (String.valueOf(vector[i]).length()) {
                case 1:
                    digit_1++;
                    break;
                case 2:
                    digit_2++;
                    break;
                case 3:
                    digit_3++;
                    break;
                case 4:
                    digit_4++;
                    break;
                case 5:
                    digit_5++;
                    break;
            }

        }
        System.out.println("\nnros. de 1 digito: " + digit_1
                + "\nnros. de 2 digitos: " + digit_2
                + "\nnros. de 3 digitos: " + digit_3
                + "\nnros. de 4 digitos: " + digit_4
                + "\nnros. de 5 digitos: " + digit_5
        );

    }

}

/*
 22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
