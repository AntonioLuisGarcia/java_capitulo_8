package array;

public class Bidimensional {
    public static int[][]  generaArrayBiInt(int i,int j,int min,int max) {

        int[][] array=new int[i][j];

        for(int fila=0;fila<i;i++){
            for(int columna=0;columna<j;j++){
                array[i][j]=(int)(Math.random()*(max-min+1)+min);
            }
        }

        return array;
    }
}
