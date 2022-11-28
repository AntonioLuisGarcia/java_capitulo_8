/*
 *6. voltea: Le da la vuelta a un número.
 *
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class ejercicio6{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y le dare la vuelta");
        int numero=sc.nextInt();

        System.out.println(matematicas.Varias.voltea(numero));
        sc.close();
   }
}