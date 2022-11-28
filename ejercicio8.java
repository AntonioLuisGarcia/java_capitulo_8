/*
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 *dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;
public class ejercicio8{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y un digito que contenga y te diremos cual es su primera posicion");
        int numero=sc.nextInt();
        int digito=sc.nextInt();

        matematicas.Varias.posicionDeDigito(numero,digito);
        sc.close();
   }
}
