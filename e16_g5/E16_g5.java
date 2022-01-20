package e16_g5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cvara
 */
public class E16_g5 {

    public static void main(String[] args) {

        String cadena;
        int suma_correcto = 0, suma_incorrecto = 0;

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese secuencias de caracteres:");
        do {

            cadena = leer.next();
            if (cadena.equals("&&&&&")) {
                break;
            } else {
                if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                    suma_correcto++;
                } else {
                    suma_incorrecto++;
                }
            }

        } while (true);
        System.out.println("Correctos: " + suma_correcto);
        System.out.println("Incorrectos: " + suma_incorrecto);
        System.out.println("fin");
    }

}

/*16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
