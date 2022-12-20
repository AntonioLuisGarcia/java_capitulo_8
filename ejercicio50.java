/*
 *
 * Ejercicio 50
 * 
 * Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de mezclar los números
 * de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
 * longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.
 * 
 * @author Antonio Luis Garcia

 

import java.util.Scanner;
import array.Array;
public class ejercicio50 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");    
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();
        int[] array= Array.generaArrayInt(longitud, minimo, maximo);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud2=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo2=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo2=sc.nextInt();
        int[] array2= Array.generaArrayInt(longitud2, minimo2, maximo2);

        Array.muestraArray(mezcla(array, array2));

        sc.close();
    }

    public static int[] mezcla(int[] a, int[] b){
        int[] array=new int[longitudConcatenacion(a, b)];
        int contadorA=a.length;
        int contadorB=b.length;

        for(int i=0;i<longitudConcatenacion(a, b);i+=2){
            if(contadorA>=1){
                array[i]=a[i/2];
                contadorA--;
            }    
            if(contadorB>=1){
                array[i+1]=b[i/2];
                contadorB--;
            }
        }
        return array;
    }

    public static int longitudConcatenacion(int[] a,int[] b){
        return a.length+b.length;
    }
    
 }
 
*/