package array;

public class Bidimensional {

    public static int[][]  generaArrayBiInt(int i,int j,int min,int max) {

        int[][] array=new int[i][j];

        for(int fila=0;fila<i;fila++){
            for(int columna=0;columna<j;columna++){
                array[fila][columna]=(int)(Math.random()*(max-min+1)+min);
            }
        }

        return array;
    }


    public static void  muestraArrayBiInt(int[][] array) {


        for(int fila=0;fila<array.length;fila++){
            for(int columna=0;columna<array[0].length;columna++){
                System.out.printf("%4s ",array[fila][columna]);
            }
            System.out.println();
        }
    }

}
