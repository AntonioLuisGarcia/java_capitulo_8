/*
 * Ejercicio 35
 *
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 * para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author Antonio Luis Garcia
 */

 import java.util.Scanner;
 import static matematicas.Varias.digitoN;
 import static matematicas.Varias.digitos;
 public class ejercicio35 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero=sc.nextInt();
        System.out.println(convierteEnPalotes(numero));
        sc.close();
    }

    public static String convierteEnPalotes(int numero) {

        String palotes ="";

        for(int i=0;i<digitos(numero);i++){

            for(int j=0;j<digitoN(numero, i);j++){
                palotes = palotes+"|";
            }

            if(i!=digitos(numero)-1){
                palotes= palotes+"-";
            }
        }
        return palotes;   
    }
 
 }