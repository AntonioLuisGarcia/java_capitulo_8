/*
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 import array.Bidimensional;
 public class ejercicio29 {

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

        Bidimensional.muestraArrayBiInt(Bidimensional.generaArrayBiInt(filas, columnas, minimo, maximo));

        sc.close();
    }
 
 }