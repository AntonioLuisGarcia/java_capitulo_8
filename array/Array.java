package array;

public class Array{

    public static void muestraArray(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
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

    
    public static int minimoArrayInt(int array[]){
        
        int numeroMinimo=Integer.MAX_VALUE;
        
        for(int i=0;i<array.length;i++){
            if(numeroMinimo>array[i]){
                numeroMinimo=array[i];
            }
        }
        
        return numeroMinimo;
        
    }
    
    public static int maximoArrayInt(int array[]){
        
        int numeroMaximo=Integer.MIN_VALUE;
        
        for(int i=0;i<array.length;i++){
            if(numeroMaximo<array[i]){
                numeroMaximo=array[i];
            }
        }
        return numeroMaximo;
    }
    
    public static int mediaArrayInt(int array[]){
        
        int total=0;
        
        for(int i=0;i<array.length;i++){
            total+=array[i];
        }
        
        return total/array.length;
    }
    
    
    public static boolean estaEnArrayInt(int array[], int numero){

        for(int i=0;i<array.length;i++){
            if(numero==array[i]){
                return true;
            }
        }
        
        return false;
    }

    public static int posicionEnArray(int array[], int numero){


        for(int i=0;i<array.length;i++){
            if(numero==array[i]){
                return i;
            }
        }
        return -1;
    }


    public static int[] volteaArrayInt(int array[]){

        int[] auxiliar=new int[array.length];

        for(int i=0;i<array.length;i++){
            auxiliar[array.length-i-1]=array[i];
        }
        return auxiliar;
    }

    public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
        int[] a = x.clone(); 
        int i;
        int aux;
        
        while (n-- > 0) {
            aux = a[0];
            for(i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = aux;
        }
          
        return a;
      }

    public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
        int[] a = x.clone();
        int i;
        int aux;
        
        while (n-- > 0) {
            aux = a[a.length - 1];
            for(i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = aux;
        }
          
        return a;
      }

    
}