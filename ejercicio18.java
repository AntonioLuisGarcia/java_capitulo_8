/*
 *Ejercicio 18
 *Escribe un programa que pase de decimal a binario.
 *
 * @author Antonio Luis Garcia
 */
import matematicas.Varias;
import java.util.Scanner;
public class ejercicio18{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero");
       int numero=sc.nextInt();
  
        System.out.println("En binario seria asi: "+Varias.decimalBinario(numero));
        sc.close();
   }
}