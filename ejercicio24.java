/*
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 
 * @author Antonio Luis Garcia
 */

import array.Array;
import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();
        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        System.out.println("¿Que numero quieres saber si esta en el array?");
        int numero=sc.nextInt(); 
        if(Array.estaEnArrayInt(array, numero)){
            System.out.println(numero+" esta");
        }else{
            System.out.println(numero+" no esta");
        }
        sc.close();
    }
}