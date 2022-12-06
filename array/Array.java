package array;

public class Array{

    public static void muestraArray(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }
        System.out.println();
    }

    public static void muestraArray(long x[]){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }
        System.out.println();
    }



    public static int[] generaArrayInt(int n, int min, int max){

        int[] array=new int[n];

        for(int i=0;i<n;i++){
            array[i]=(int)(Math.random()*(max-min+1)+min);
        }

        return array;
        
    }

}