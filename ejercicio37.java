/*
 * Ejercicio 37
 *
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 * 
 * @author Antonio Luis Garcia


 import java.util.Scanner;
 import static matematicas.Varias.digitos;
 import static matematicas.Varias.digitoN;;
 public class ejercicio37 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di un numero");
        int numero=sc.nextInt();

        System.out.println(convierteEnMorse(numero));

        sc.close();
    }

    public static String convierteEnMorse(int numero) {

        String texto="";

        String[] morse = {
            "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
            ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
          };

        for(int i=0;i<digitos(numero);i++){
                texto += morse[digitoN(numero, i)];
        }
        
        return texto;   
    }
 
 }

  */