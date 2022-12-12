/*
 *14. juntaNumeros: Pega dos números para formar uno.
 *
 *@author Antonio Luis Garcia 
 */
 

import java.util.Scanner;
public class ejercicio14{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di dos numeros y los uniremos");
        int numero1=sc.nextInt();
        int numero2=sc.nextInt();

        System.out.print(matematicas.Varias.juntaNumeros(numero1,numero2)); 
        sc.close();
   }
}
