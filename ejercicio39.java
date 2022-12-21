/*
 * Ejercicio 39
 *
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
 * convertido a palabras sería:
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde
 * la función no se debe mostrar nada por pantalla, solo se debe usar print desde
 * el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
 * final.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 import static matematicas.Varias.digitos;
 import static matematicas.Varias.digitoN;;
 public class ejercicio39 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di un numero");
        int numero=sc.nextInt();

        System.out.println(convierteEnPalabras(numero));

        sc.close();
    }

    public static String convierteEnPalabras(int numero) {

        String texto="";

        String[] palabras = {
            "cero", "uno", "dos", "tres", "cuatro",
            "cinco","seis", "siete", "ocho", "nueve"
          };

        for(int i=0;i<digitos(numero);i++){
                texto += palabras[digitoN(numero, i)] +", ";
        }
        
        return texto;   
    }
 
 }
