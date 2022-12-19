/*
 * Ejercicio 45
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
 * usuario debe introducir la altura de la figura. Podemos suponer que el usuario
 * introduce una altura mayor o igual a 3.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 public class ejercicio45 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di que altura quieres");
        int altura=sc.nextInt();
        pintaValle(altura);
        sc.close();
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
    }

    public static void pintaValle(int altura){

        for(int i=0;i<altura;i++){
            linea('*', i+1);
            espacios(altura-i-1);
            espacios(altura-i-1);
            linea('*', i+1);
            System.out.println();
        }
    }
 }
 */