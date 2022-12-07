/*
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();
        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        Array.muestraArray(array);  
        System.out.print("Te dire cual es el menor: "+ Array.minimoArrayInt(array));   

        sc.close();
    }
}
