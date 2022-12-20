/*
 * Ejercicio 48
 * Define la función concatena con la siguiente cabecera:
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
 * concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 * 
 * @author Antonio Luis Garcia

 

 import java.util.Scanner;
 import array.Array;
 public class ejercicio48 {
     
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Di cuantos numeros quieres en el array");
         int longitud=sc.nextInt();
         System.out.println("Que valor maximo");
         int maximo=sc.nextInt();
         System.out.println("Que valor minimo");
         int minimo=sc.nextInt();
         int[] array= Array.generaArrayInt(longitud, minimo, maximo);

         System.out.println("Di cuantos numeros quieres en el array");
        int longitud2=sc.nextInt();
        System.out.println("Que valor maximo");
        int maximo2=sc.nextInt();
        System.out.println("Que valor minimo");
        int minimo2=sc.nextInt();
        int[] array2= Array.generaArrayInt(longitud2, minimo2, maximo2);

        Array.muestraArray(concatena(array, array2));
         
         sc.close();
        }


    public static int[] concatena(int[] a, int[] b){

        int[] concatenado=new int[(longitudConcatenacion(a, b))];

        for(int i=0;i<longitudConcatenacion(a, b);i++){
            if(i<a.length){
                concatenado[i]=a[i];
            }else{
                concatenado[i]=b[i-a.length];
            }
        }

        return concatenado;
        }
        
    public static int longitudConcatenacion(int[] a,int[] b){
        return a.length+b.length;
    }
    
 }
 */