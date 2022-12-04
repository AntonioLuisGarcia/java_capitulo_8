/*
 *Ejercicio 17
 *Escribe un programa que pase de binario a decimal.
 *
 * @author Antonio Luis Garcia
 */
 import matematicas.Varias;
 import java.util.Scanner;
 public class ejercicio17{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero");
       int numero=sc.nextInt();
  
        System.out.println("En decimal seria asi: "+Varias.binarioDecimal(numero));
        sc.close();
      }
   }