/*
 Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package gladis_14;


import java.util.Locale;
import java.util.Scanner;

public class gladis_14 {

    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int num1, num2;
        char opcion;
        String salir;
        salir = "N";
        System.out.println("ingrese un numero");
        num1 = entrada.nextInt();
        System.out.println("ingrese otro numero");
        num2 = entrada.nextInt();

        System.out.println("");
        
        do {

            System.out.println("ELIJA UNA OPCION DEL MENU:");
            System.out.println("=====================");

            System.out.println("///MENU///");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            System.out.println("=======================");
            System.out.println("");
            //System.out.println("//SU OPCION ES//");

            opcion =entrada.next().charAt(0);

            switch (opcion) {
                case '1':
                  
                    System.out.println("LA SUMA DE LOS NUMEROS ES: "+ (num1 + num2));
                    //scan.close();
                    break;
                case '2':
                    System.out.println("LA RESTA DE LOS NUMEROS ES: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("LA MULTIPLICACION ES: " + (num1 * num2));
                    break;
                case '4':
                    System.out.println("LA DIVIDION ES: " + (num1 / num2));
                    break;
                case '5':

                    System.out.println("ESTA SEGURO QUE DESEA SALIR? PRESIONE: S/N");
                    salir = entrada.next();

                    break;

                default:
                    System.out.println("ELIGIO UNA OPCION INCORRECTA");
                    
            }

        } while (!salir.equals("s"));

    }

}