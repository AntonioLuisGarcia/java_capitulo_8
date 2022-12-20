/*
 *
 * Ejercicio 51
 * Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
 * continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa de la forma que muestra el ejemplo.
 * 
 * @author Antonio Luis Garcia
 
 
 import java.util.Scanner;
 import array.Array;
 import matematicas.Varias;
 public class ejercicio51 {
     
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] array= Array.generaArrayInt(10, 2,100);
        Array.muestraArray(array);
        System.out.println();
        muestra(array);
        sc.close();
    }

    public static void primoCapicua(int numero){
        if(Varias.esCapicua(numero) && Varias.esPrimo(numero)){
            System.out.println("El "+numero+ " es primo y capicua");
        }else if(Varias.esCapicua(numero) && !Varias.esPrimo(numero)){
            System.out.println("El "+numero+ " no es primo y es capicua");
        }else if(!Varias.esCapicua(numero) && Varias.esPrimo(numero)){
            System.out.println("El "+numero+ " es primo y no es capicua");
        }else if(!Varias.esCapicua(numero) && !Varias.esPrimo(numero)){
            System.out.println("El "+numero+ " no es primo y no es capicua");
        }
    }

    public static void muestra(int[] array){
        for(int i=0;i<array.length;i++){
            primoCapicua(array[i]);
        }
    }
 }
 */