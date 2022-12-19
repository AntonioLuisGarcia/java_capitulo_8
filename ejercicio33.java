/*
 * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 
 * @author Antonio Luis Garcia


 import java.util.Scanner;
 import array.Bidimensional;
 public class ejercicio33 {

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
        System.out.print("¿De que fila quieres? \n");
        int fil=sc.nextInt();
        System.out.print("¿De que columna quieres? \n");
        int col=sc.nextInt();

        if(Bidimensional.esPuntoDeSilla(Bidimensional.generaArrayBiInt(filas, columnas, minimo, maximo), fil, col)){
            System.out.println("es punto de silla");
        }else{
            System.out.println("no es punto de silla");
        }

        sc.close();
    }
 
 }

  */