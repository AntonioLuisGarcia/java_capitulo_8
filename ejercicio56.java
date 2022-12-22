/*
 *
 * Ejercicio 56
 * Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array bidimensional. Esta capa se 
 * extrae en forma de array de una dimensión. La extracción de números comienza en la esquina superior izquierda y 
 * continúa en el sentido de las agujas del reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa.
 *
 * @author Antonio Luis Garcia
 */


 import java.util.Scanner;
 import array.Array;
 import array.Bidimensional;
 public class ejercicio56 {
     
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.println("De que longitud quiere el array");
        System.out.print("Filas: \n");
        int filas=sc.nextInt();
        System.out.print("Columnas: \n");
        int columnas=sc.nextInt();
        System.out.println("Entre que numeros quiere el array");
        System.out.print("Minimo: \n");
        int minimo=sc.nextInt();
        System.out.print("Maximo: \n");
        int maximo=sc.nextInt();
        int[][] array= Bidimensional.generaArrayBiInt(filas, columnas, maximo, minimo);
        Bidimensional.muestraArrayBiInt(array);
        System.out.println();
        Array.muestraArray(corteza(array));

        sc.close();
        }
        
        public static int[] corteza(int[][] n){

            int[] array = new int[n.length*2+n[0].length*2-4];
            int contadorArray = 0;

            for(int i = 0 ; i < n.length ; i++){

                for(int j = 0 ; j < n[i].length ; j++){

                    if(i == 0 || j==0 || i == n.length-1 || j == n[i].length-1){
                        array[contadorArray++] = n[i][j];
                    }

                }
            }
 
            return array;
        }

 }