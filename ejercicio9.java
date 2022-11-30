/*
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 *derecha).
 * 
 * @author Antonio Luis Garcia
 */
 

import java.util.Scanner;
public class ejercicio9{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero y le quitaremos los digitos que quieras por detras");
        int numero=sc.nextInt();
        int digitos=sc.nextInt();

        System.out.print(matematicas.Varias.quitaPorDetras(numero,digitos)); 
        sc.close();
   }
}