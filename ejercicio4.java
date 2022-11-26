/*
 *4. potencia: Dada una base y un exponente devuelve la potencia.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class ejercicio4{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y a cuanto lo quieras elevar y te dire el resultado");
        int base=sc.nextInt();
        int exponente=sc.nextInt();

        System.out.println("El resultado es "+matematicas.Varias.potencia(base,exponente));
        sc.close();
   }
}
