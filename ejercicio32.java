/*
 * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 * 
 * @author Antonio Luis Garcia
 
 import java.util.Scanner;
 import array.Bidimensional;
 import array.Array;
 public class ejercicio32 {
     
     public static void main(String[] args) {
        
         Scanner sc= new Scanner(System.in);
         System.out.println("De que longitud quiere el array");
         System.out.print("Filas: \n");
         int filas=sc.nextInt();
         System.out.print("Columnas: \n");
         int columnas=sc.nextInt();
         System.out.println("Entre que numeros quiere el array");
         System.out.print("Minimo: \n");
        int minimo=sc.nextInt();
        System.out.print("Maximo: \n");
        int maximo=sc.nextInt();
        System.out.print("¿Que numero quieres su posicion? \n");
        int numero=sc.nextInt();

        int[] posicion=Bidimensional.coordenadasEnArrayBiInt(Bidimensional.generaArrayBiInt(filas, columnas, minimo, maximo), numero);
        
        Array.muestraArray(posicion);
        
        sc.close();
    }
    
}
*/