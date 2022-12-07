/*
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición
 *(el índice) en la que se encuentra.
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();
        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        System.out.println("¿Que posicion de numero quieres saber?");
        int numero=sc.nextInt(); 
        System.out.println(numero+" esta en la posicion: "+Array.posicionEnArray(array, numero));
        sc.close();
    }
}