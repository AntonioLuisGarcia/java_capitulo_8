package array;

public class Array{

    public static void muestraArray(int x[]){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    public static void muestraArray(long x[]){
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
    
    /*
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

    public static int[] rotaIzquierdaArrayInt(int array[],int numeroIzquierda){

        int[] auxiliar=array.clone();

        for(int i=0;i<array.length;i++){
            if(i+numeroIzquierda>=array.length){
                auxiliar[i]=array[i+numeroIzquierda-array.length+1];
            }else{
                auxiliar[i]=array[i+numeroIzquierda];
            }
        }
        return auxiliar;
    }

    public static int[] rotaDerechaArrayInt(int array[],int numeroDerecha){

        int[] auxiliar=array.clone();

        for(int i=0;i<array.length;i++){
            if(i-numeroDerecha<0){
                auxiliar[i]=array[i-numeroDerecha+array.length-2];
            }else{
                auxiliar[i]=array[i-numeroDerecha];
            }
        }
        return auxiliar;
    }

     */
}