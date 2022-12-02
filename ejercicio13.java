/*
 *13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 *dentro de un número y devuelve el trozo correspondiente.
 *
 * @author Antonio Luis Garcia
 */
import matematicas.Varias;
import java.util.Scanner;
public class ejercicio13{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero");
       int numero=sc.nextInt();
       System.out.println("Por donde quieres cortar el numero \nLa primera posicion");
       int principio=sc.nextInt();
       System.out.println("La ultima posicion");
       int utlimo=sc.nextInt();
       
        System.out.println("Tiene "+Varias.digitos(numero)+" digitos");
        sc.close();
   }
}