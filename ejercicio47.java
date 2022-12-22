/*
 * Ejercicio 47
 * 
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * Esta función toma como parámetro un array que contiene números y devuelve
 * una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
 * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve“62501”.
 * 
 * @author Antonio Luis Garcia
 */
 

 import java.util.Scanner;
 import array.Array;
 public class ejercicio47 {
     
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Di cuantos numeros quieres en el array");
         int longitud=sc.nextInt();
         System.out.println("Que valor maximo");
         int maximo=sc.nextInt();
         System.out.println("Que valor minimo");
         int minimo=sc.nextInt();
         int[] array= Array.generaArrayInt(longitud, minimo, maximo);

        System.out.println(convierteArrayEnString(array));


        
        sc.close();
    }
    
    public static String convierteArrayEnString(int[] a){

        String[] numeros={"0","1","2","3","4","5","6","7","8","9"};
        String traduccion="";

        for(int i=0;i<a.length;i++){
            traduccion += numeros[a[i]];
        }

        return traduccion;
    }
 }
