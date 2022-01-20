
package e1_g5;

import java.util.Locale; //para decimiales con punto
import java.util.Scanner; // para entrada de datos

//para importar shift espacio en la linea 
/**
 *
 * @author cvara
 */
public class E1_g5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //algoritmo
       int numero_1=0,numero_2=0,suma=0;  //definir numero_1,numero_2 como entero ...numero_1=0...
       Scanner leer= new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);// leer numero_1...
       
       System.out.print("Ingrese nro. 1: "); //escribir..
       
       numero_1=leer.nextInt();
       
       System.out.print("Ingrese nro. 2: ");
       
       numero_2=leer.nextInt();
       
       suma=numero_1+numero_2;
       
       System.out.println();//Escribir ""
       
       System.out.print("La suma es: "+suma);//psint se usaba coma, aca es un +
       
       System.out.println();
       System.out.println();                           
    } //fin_algoritmo
}

    
  /*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/





/*Scanner entrada=new Scanner(System.in,"UTF-8").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("ingrese cadena");
        String cadena=entrada.next();
        
        System.out.println("ingrese letra");
        char letra=entrada.next().charAt(0);
        
        System.out.println("ingrese un entero");
        int entero=entrada.nextInt();
        
        System.out.println("ingrese un flotante");
        double flotante=entrada.nextDouble();
        
        System.out.println("ingrese un boleano");
        boolean boleano=entrada.nextBoolean();
    }*/