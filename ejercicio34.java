/*
 * 6. diagonal: Devuelve un array que contiene una de las diagonales del array
 * bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es
 * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
 * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
 * mientras que la cadena “neso” indica que se elige la diagonal que va del
 * noreste hacia el suroeste.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 import array.Bidimensional;
 import array.Array;
 public class ejercicio34 {

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
        System.out.print("¿De que fila quieres? \n");
        int fil=sc.nextInt();
        System.out.print("¿De que columna quieres? \n");
        int col=sc.nextInt();
        System.out.print("¿Que diagonal quieres? \nNose \nNeso \n");
        String diagonalEleccion=sc.next();

        Array.muestraArray(Bidimensional.diagonal(Bidimensional.generaArrayBiInt(filas, columnas, minimo, maximo), fil, col, diagonalEleccion));

        sc.close();
    }
 
 }
