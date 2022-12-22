/*
 *
 * Ejercicio 52
 * Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:
 * Esta función debe devolver un número del array escogido al azar entre todos los disponibles.
 * Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111,
 * el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de prueba.
 *
 * @author Antonio Luis Garcia
 */


 import java.util.Scanner;
 import array.Array;
 public class ejercicio52 {
     
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Di cuantos numeros quieres en el array");
         int longitud=sc.nextInt();
         System.out.println("Que valor maximo");
         int maximo=sc.nextInt();
         System.out.println("Que valor minimo");
         int minimo=sc.nextInt();
         int[] array= Array.generaArrayInt(longitud, minimo, maximo);

        Array.muestraArray(array);

        System.out.print("\nEl numero aleatorio es "+aleatorioDeArray(array));
         sc.close();
        }
        
        public static int aleatorioDeArray(int[] a){
            return a[(int)(Math.random()*(a.length+1))];
        }
 }
