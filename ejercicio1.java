/*
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;

 public class ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y te dire si es capicua");
        int numero=sc.nextInt();

        if(matematicas.Varias.esCapicua(numero)){
            System.out.println(numero+" es capicua");
        }else{
            System.out.println(numero+" no es capicua");
        }

        sc.close();
    }

 }