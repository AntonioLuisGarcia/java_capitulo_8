/* 
 *
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 import matematicas.Varias;
 public class multiplicacion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros y te dire su multiplicacion");
        
        int numero=sc.nextInt();
        int numero1=sc.nextInt();
        System.out.println(Varias.multiplicacion(numero, numero1));
        sc.close();
    }

 }