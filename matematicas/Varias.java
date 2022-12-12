package matematicas;

public class Varias{

    public static int voltea(int x){

        return (int)voltea((long)x);
    }

    public static long voltea(long x){
        long volteado=0;
        while(x>0){
            volteado=(volteado*10)+x%10;
            x/=10;
        }

        return volteado;
    }



    public static boolean esCapicua(long x){
        if(voltea(x)==x){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esCapicua(int x){
      return esCapicua((long)x);
    }



    public static boolean esPrimo(int x){
        return esPrimo((long)x);
    }

    public static boolean esPrimo(long x){

        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }



    public static long siguientePrimo(int x){

        return siguientePrimo((long)x);
    }

    public static long siguientePrimo(long x){

        while (!esPrimo(++x)){}
        return x;
    }
    


    public static double potencia(long base, int exponente){

        if(exponente==0){
            return 1;
        }
        if(exponente<0){
            return 1/potencia(base,-exponente);
        }
        double total=1;
        for(int i=1;i<=exponente;i++){
            total=total*base;
        }
        return total;

    }

    public static int digitos(int x){

        return (int)digitos((long)x);
    }
    
    public static long digitos(long x){
        
        if(x==0){
            return 1;
        }
        
        int longitud=0;
        while(x>0){
            x/=10;
            longitud++;
        }

        return longitud;
    }
    
    
    public static int digitoN(long numero, int posicion){
    
        if(posicion<0 || posicion>digitos(numero)){
            return -1;
        }
        return (int)(voltea(numero)/(long)(potencia(10, posicion)))%10;
    }
    
    public static int digitoN(int numero, int posicion){
   
        return digitoN((long)numero, posicion);
    }

     

    public static void posicionDeDigito(int numero, int digito){
        numero=voltea(numero);
        int contador=digitos(numero);
        int copia=contador;
        boolean salir=true;

        while(salir){
            if(numero%10==digito){
                salir=false;
            }

            contador--;
            numero/=10;
            if(contador==0){
                salir=false;
            }
        }

        if(contador==0){
            System.out.println("-1");
        }else{
            System.out.println("La posicion es la "+(copia-contador));
        }
    }

  

    public static int quitaPorDetras(int numero, int digitos){

        for(int i=1;i<=digitos;i++){
            numero/=10;
        }

        return numero;

    }

    
    public static int quitarPorDelante(int numero, int digitos){

        numero=voltea(numero);

        numero=quitaPorDetras(numero, digitos);

        numero=voltea(numero);

        return numero;
    }

    public static int pegaPorDetras(int numero,int digito){
        numero=numero*10+digito;

        return numero;
    }

    
    public static int pegaPorDelante(int numero,int digito){
        
        numero=voltea(numero);
        numero=pegaPorDetras(numero, digito);
        numero=voltea(numero);
        
        return numero;
    }   
    
    public static int juntaNumeros(int numero1, int numero2){
        int digitos=digitos(numero2);
        return numero1*(int)(Math.pow(10, digitos))+numero2;
    }

    public static int trozoDeNumero(int numero, int principio,int fin){

        int ultimo=digitos(numero)-fin;

        numero=quitarPorDelante(numero,principio);

        numero=quitaPorDetras(numero, ultimo);

        return numero;
    }


    public static int decimalBinario(int numero){
        int contador=0;
        int decimal=0;
        while(numero>0){
            decimal=decimal+((numero%2)*(int)potencia(10, contador));
            numero/=2;
            contador++;
        }
        return decimal;
    }

    public static int binarioDecimal(int num) {
        int longitud=digitos(num);
        int posicion=0;
        int decimal=0;
        for(int i=1;i <= longitud;i++){
            decimal=decimal+((num%10)*(int)potencia(2, posicion));
            posicion++;
            num/=10;
        }
        return decimal;
    }

}