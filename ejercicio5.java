/*
 *5. digitos: Cuenta el número de dígitos de un número entero.
 *
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class ejercicio5{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero y te dire cuanntos digitos tiene");
       int numero=sc.nextInt();

        System.out.println("Tiene "+matematicas.Varias.digitos(numero)+" digitos");
        sc.close();
   }
}