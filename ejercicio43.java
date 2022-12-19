/*
 * Ejercicio 43
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 public class ejercicio43 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di que altura quieres");
        int altura=sc.nextInt();
        pintaTriangulo(altura);
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
        System.out.println();
    }

    public static void pintaTriangulo(int altura) {
     
        for(int i=0;i<altura;i++){
            espacios(i);
            linea('*', altura-i);
        }
    }
 }
 */