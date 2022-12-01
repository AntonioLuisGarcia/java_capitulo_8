/*
*11. pegaPorDetras: Añade un dígito a un número por detrás.
*
*@author Antonio Luis Garcia 
*/
 

import java.util.Scanner;
public class ejercicio11{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero y le añadiremos un numero por detras");
        int numero=sc.nextInt();
        int digito=sc.nextInt();

        System.out.print(matematicas.Varias.pegaPorDetras(numero,digito)); 
        sc.close();
   }
}