/*
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 *un array
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio28 {
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
        System.out.println("Cuantas posiciones rotas");
        int rotarIzquierda=sc.nextInt();
        Array.muestraArray(Array.rotaIzquierdaArrayInt(array,rotarIzquierda));
        

        sc.close();
    }
}