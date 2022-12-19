/*
 * Ejercicio 46
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
 * usuario debe introducir la altura de la figura. Podemos suponer que el usuario
 * introduce una altura mayor o igual a 3.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 public class ejercicio46 {

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

    public static void linea(int repeticiones) {
        for(int i=0;i<repeticiones;i++){
            astreisco('*');
        }
    }

    public static void lineaHueca(int repeticiones) {
        espacios(repeticiones);
    }

    public static void astreisco(char caracter) {
        System.out.print('*');
    }

    public static void pintaValle(int altura){

        astreisco('*');
        espacios(altura+altura-3);
        astreisco('*');
        System.out.println();
        for(int i=0;i<altura-2;i++){
            astreisco('*');
            lineaHueca(i);
            astreisco('*');
            espacios(altura-i-2);
            espacios(altura-i-3);
            astreisco('*');
            lineaHueca(i);
            astreisco('*');
            System.out.println();
        }
        linea(altura);
        linea(altura-1);
    }
 }
 */