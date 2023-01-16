/*
 *
 * Ejercicio 54
 * 
 * La función ocurrencias devuelve el número de veces que aparece un dígito  dentro de un número (primera función) 
 * o bien el número de veces que aparece un dígito en una serie de números contenidos en un array (segunda función).
 *
 * @author Antonio Luis Garcia
 */


 import java.util.Scanner;
 import array.Array;
 public class ejercicio54 {
     
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("1-Array \n2-Numero ");
         int decision = sc.nextInt();
         if(decision == 1){

            System.out.println("Di cuantos numeros quieres en el array");
            int longitud=sc.nextInt();
            System.out.println("Que valor maximo");
            int maximo=sc.nextInt();
            System.out.println("Que valor minimo");
            int minimo=sc.nextInt();
            int[] array= Array.generaArrayInt(longitud, minimo, maximo);

         }else if(decision == 2){

            System.out.println("¿Cuanto de grande quieres el numero?");
            int max = sc.nextInt();
            int numero = (int)(Math.random()*max+1);

         }
         
         sc.close();
        }
        

        public static int ocurrencias(int digito, int n){

            

        }


        public static int ocurrencias(int digito, int[] a){



        }
 }

