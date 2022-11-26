/*
 *3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 *se pasa como parámetro.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class ejercicio3{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero y te dire el siguiente primo");
       int numero=sc.nextInt();

      System.out.println("El siguinete primo es "+matematicas.Varias.siguientePrimo(numero));
        sc.close();
   }
}