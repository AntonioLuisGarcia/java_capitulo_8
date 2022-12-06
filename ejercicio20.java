/*
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
 *cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("QUe valor minimo");
        int minimo=sc.nextInt();

        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        Array.muestraArray(array);        
        sc.close();
    }
}
