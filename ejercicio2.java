/*
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 *es primo y falso en caso contrario.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class ejercicio2{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero y te dire si es primo");
       int numero=sc.nextInt();

       if(matematicas.Varias.esPrimo(numero)){
           System.out.println(numero+" es primo");
       }else{
           System.out.println(numero+" no es primo");
       }

       sc.close();
   }

}