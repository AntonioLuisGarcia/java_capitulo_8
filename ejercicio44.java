/*
 * Ejercicio 44
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 public class ejercicio44 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di que altura quieres");
        int altura=sc.nextInt();
        pintaTrianguloHueco(altura);
        sc.close();
    }

    public static void asterisco(char caracter) {
        System.out.print('*');
    }

    public static void espacios(int repeticiones) {
        for(int i=0;i<repeticiones;i++){
            System.out.print(" ");
        }
    }

    public static void linea(char caracter,int repeticiones) {
        for(int i=0;i<repeticiones;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void pintaTrianguloHueco(int altura) {

        linea('*',altura);
     
        for(int i=0;i<altura-1;i++){
            espacios(i+1);
            asterisco('*');
            espacios(altura-i-3);
            if(i!=altura-2){
                asterisco('*');
            }
            System.out.println();
        }
    }
 }
