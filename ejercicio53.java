/*
 *
 * Ejercicio 53
 * Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional en la 
 * posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
 * es el 0. Si la posición donde se busca no existe en el array, la función debe devolver -1. Se debe entregar tanto
 * el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:
 * 
 * @author Antonio Luis Garcia
 */



import java.util.Scanner;
import array.Array;
import matematicas.Varias;
public class ejercicio53 {
    
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