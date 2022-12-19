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

    
    public static int[]  filaDeArrayBiInt(int[][] array,int filaDeseada) {

        int[] fil=new int[array.length];
        int cont=0;

        for(int fila=0;fila<array.length;fila++){
            for(int columna=0;columna<array[0].length;columna++){

                if(fila==filaDeseada){
                    fil[cont]=array[fila][columna];
                    cont++;
                }
            }
        }

        return fil;
    }

    
    public static int[]  columnaDeArrayBiInt(int[][] array,int columnaDeseada) {

        int[] col=new int[array[0].length];
        int cont=0;

        for(int fila=0;fila<array.length;fila++){
            for(int columna=0;columna<array[0].length;columna++){

                if(columna==columnaDeseada){
                    col[cont]=array[fila][columna];
                    cont++;
                }
            }
        }
        
        return col;
    }
    
    /* 
    public static int[]  coordenadasEnArrayBiInt(int[][] array,int numero) {

        for(int fila=0;fila<array.length;fila++){
            for(int columna=0;columna<array[0].length;columna++){
                if(array[fila][columna]==numero){
                    int[] coordenada={fila ,columna};

                    return coordenada;
                }
            }
        }

        int[] coordenada={-1,-1};
        
        return coordenada;
    }

    public static boolean esPuntoDeSilla(int[][] array, int i, int j) {
        int[] fil= filaDeArrayBiInt(array, i);
        int[] col= columnaDeArrayBiInt(array, j);

        return((Array.minimoArrayInt(fil)==array[i][j]) && (Array.maximoArrayInt(col)==array[i][j]));
        
    }

    public static int[] diagonal(int[][] array, int i, int j,String eleccion) {

        int numeros=0;
        int[] auxiliar=new int[1000];

        for(int filas=0;filas<array.length;filas++){
            for(int columnas=0;columnas<array[0].length;columnas++){
                if( (((j - columnas) == (filas - i)) && (eleccion.equals("nose")))
                || (((j - columnas) == (i - filas)) && (eleccion.equals("neso")))){
                    auxiliar[numeros++]=array[filas][columnas];
                }
            }
        }
        int[] diagonal=new int[numeros];

        for(int fila = 0;fila<numeros;fila++){
            diagonal[fila]=auxiliar[fila];
        }

        return diagonal;
        
    }
     */

}
