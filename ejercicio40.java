/*
 * Ejercicio 40
 *
 *  Devuelve un array con todos los números
 * que contienen el 7 (por ej. 7, 27, 782)
 * que se encuentren en otro array que se
 * pasa como parámetro. El tamaño del array
 * que se devuelve será menor o igual al
 * que se pasa como parámetro.
 * 
 * @author Antonio Luis Garcia
 

 import java.util.Scanner;
 import static matematicas.Varias.posicionDeDigito;
 import  array.Array;
 public class ejercicio40 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Di cuantos numeros quieres en el array");
        int longitud=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo=sc.nextInt();

        int[] array= Array.generaArrayInt(longitud, minimo, maximo);
        Array.muestraArray(filtraCon7(array));

        sc.close();
    }

    public static int[] filtraCon7(int[] array) {

        int[] aux=new int[array.length];
        int numeros=0;
        for(int i=0;i<array.length;i++){

            if(posicionDeDigito(array[i],7)!=-1){
                aux[numeros++]=array[i];
            }
        }

        int[] numeros7= new int[numeros];

        for(int j=0;j<numeros;j++){
            numeros7[j]=aux[j];
        }

        return numeros7;   
    }
 
 }
  */