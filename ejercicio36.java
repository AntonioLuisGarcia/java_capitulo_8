/*
 * Ejercicio 36
 *
 *  Devuelve un array con todos los
 * números primos que se encuentren
 * en otro array que se pasa como
 * parámetro.
 * Obviamente el tamaño del array
 * que se devuelve será menor o
 * igual al que se pasa como
 * parámetro.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 import static matematicas.Varias.esPrimo;
 import  array.Array;
 public class ejercicio36 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();

        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        Array.muestraArray(filtraPrimos(array));

        sc.close();
    }

    public static int[] filtraPrimos(int[] array) {

        int[] primosAux=new int[array.length];
        int numeros=0;
        for(int i=0;i<array.length;i++){

            if(esPrimo(array[i])){
                primosAux[numeros++]=array[i];
            }
        }

        int[] primos= new int[numeros];

        for(int j=0;j<numeros;j++){
            primos[j]=primosAux[j];
        }

        return primos;   
    }
 
 }
  */