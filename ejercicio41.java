/*
 * Ejercicio 41
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el carácter
 * especificado.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 public class ejercicio41 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di que altura quieres");
        int altura=sc.nextInt();
        pintaTriangulo(altura);
        sc.close();
    }

    public static void linea(char caracter,int repeticiones) {
        for(int i=0;i<repeticiones;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void pintaTriangulo(int altura) {
     
        for(int i=0;i<altura;i++){
            linea('*', altura-i);
        }
    }
 }
 */