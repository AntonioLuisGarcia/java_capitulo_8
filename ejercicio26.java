/*
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio26 {
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
        Array.muestraArray(Array.volteaArrayInt(array));
        

        sc.close();
    }
}