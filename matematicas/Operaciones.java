package matematicas;

public class Operaciones{


       /** suma
    * Devuelve la suma de dos números.
    * <p>
    * @param a Sumando primero
    * @param b Sumando segundo
    * @return  La suma de a y b
    */

      public static int suma(int x, int y) {
        return (int)suma((long)x,(long) y);
      }

      /** suma
    * Devuelve la suma de dos números.
    * <p>
    * @param a Sumando primero
    * @param b Sumando segundo
    * @return  La suma de a y b
    */

      public static long suma(long x, long y) {
        return x+y;
      }

      /** inc
    * Incrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a incrementar
    * @return  El valor recibido incrementado en uno
    */

      public static int inc(int numero){
        return (int)inc((long)numero);
      }

      /** inc
    * Incrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a incrementar
    * @return  El valor recibido incrementado en uno
    */

      public static long inc(long numero){
        return suma(1, numero);
      }


       /** resta
    * Devuelve la resta de dos números
    * <p>
    * @param a Minuendo
    * @param b Sustraendo
    * @return La resta de los dos números
    */

      public static int resta(int x, int y) {
            return (int)resta((long) x, (long) y);
      }


      /** resta
    * Devuelve la resta de dos números
    * <p>
    * @param a Minuendo
    * @param b Sustraendo
    * @return La resta de los dos números
    */

      public static long resta(long x, long y) {
        y=-y;
        return suma(x, y);
      }


       /** dec
    * Decrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a decrementar
    * @return  El valor recibido decrementado en uno
    */

      public static int dec(int numero) {
        return (int)dec((long)numero);
      }

      /** dec
        * Decrementa en uno el valor recibido y lo devuelve
        * <p>
        * @param a Valor a decrementar
        * @return  El valor recibido decrementado en uno
        */

      public static long dec(long numero) {
        return resta(numero, 1);
      }

        /** esMayor
    * Comprueba si un número es mayor que otro
    * <p>
    * @param a Valor a comparar si es mayor
    * @param b Valor a comparar si es menor
    * @return  true si a es mayor que b y
    *          false si es igual o menor
    */

      public static boolean esMayor(int x,int y) {
        return esMayor((long) x, (long)y);
      }

    /** esMayor
    * Comprueba si un número es mayor que otro
    * <p>
    * @param a Valor a comparar si es mayor
    * @param b Valor a comparar si es menor
    * @return  true si a es mayor que b y
    *          false si es igual o menor
    */

      public static boolean esMayor(long x, long y) {
          return resta(x,y)>0;
      }

      /** esMenor
          * Comprueba si un número es menor que otro
          * <p>
          * @param a Valor a comparar si es menor
          * @param b Valor a comparar si es mayor
          * @return  true si a es menor que b y
          *          false si es igual o mayor
          */

      public static boolean esMenor(int x,int y) {
        return esMenor((long)x,(long) y);
      }


      /** esMenor
          * Comprueba si un número es menor que otro
          * <p>
          * @param a Valor a comparar si es menor
          * @param b Valor a comparar si es mayor
          * @return  true si a es menor que b y
          *          false si es igual o mayor
          */

      public static boolean esMenor(long x, long y) {
          return 0>resta(x,y);
      }


    /** esIgual
    * Comprueba si un número es igual que otro
    * <p>
    * @param a Primer valor a comparar
    * @param b Segundo valor a comparar
    * @return  true si son iguales y false si son distintos
    */

      public static boolean esIgual(int x,int y) {
        return esIgual((long)x,(long) y);
      }


    /** esIgual
    * Comprueba si un número es igual que otro
    * <p>
    * @param a Primer valor a comparar
    * @param b Segundo valor a comparar
    * @return  true si son iguales y false si son distintos
    */

      public static boolean esIgual(long x, long y) {
          return !esMayor(x, y) && !esMenor(x, y);
      }


    /** multiplica
    * Devuelve la multiplicación de dos números usando sumas
    * <p>
    * @param a Multiplicando
    * @param b Multiplicador
    * @return  El resultado de sumar b veces a
    */

    public static int multiplica(int x, int y) {
     
      return (int)multiplica((long)x,(long)y);
    }


    /** multiplica
    * Devuelve la multiplicación de dos números usando sumas
    * <p>
    * @param a Multiplicando
    * @param b Multiplicador
    * @return  El resultado de sumar b veces a
    */

    public static long multiplica(long x, long y) {
      long total=0;
      long nveces=x;
      while(esMayor(nveces,0)){
        nveces=dec(nveces);
        total=suma(total,y);
      }
      return total;
    }

    /** divide
    * Devuelve el cociente de la división entera de dos números usando restas
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el cociente de la división entera de a entre b
    *          realizando restas
    */

    public static int divide(int x,int y) {
      return (int)divide((long)x,(long)y);
    }


    /** divide
    * Devuelve el cociente de la división entera de dos números usando restas
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el cociente de la división entera de a entre b
    *          realizando restas
    */

    public static long divide(long x, long y) {
      long contador=0;
      while(esMayor(x, y) || esIgual(x, y)){
        contador=inc(contador);
        x=resta(x, y);
      }
      return contador;
    }


   /** resto
    * Devuelve el resto de la división entera
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el resto de la división entera de a entre b
    */

    public static int resto(int x, int y) {
      return (int)resto((long)x,(long)y);
    }

     /** resto
    * Devuelve el resto de la división entera
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el resto de la división entera de a entre b
    */

    public static long resto(long x, long y) {
      return resta(x,multiplica(divide(x, y),y));
    }
  
   /** potencia
    * Devuelve la potencia de un número elevado a otro
    * <p>
    * @param base      base
    * @param exponente exponente
    * @return          Devuelve la potencia de un número elevado a otro usando multiplicaciones
    */

    public static int potencia(int x,int y) {
      return (int)potencia((long)x, (long)y);
    }


    /** potencia
    * Devuelve la potencia de un número elevado a otro
    * <p>
    * @param base      base
    * @param exponente exponente
    * @return          Devuelve la potencia de un número elevado a otro usando multiplicaciones
    */

    public static long potencia(long x,long y) {
      if(esIgual(x, 0)){
        return 1;
      }
      long contador=1;
      long total=x;
      while(esMayor(y, contador)){
        total=multiplica(total, x);
        contador=inc(contador);
      }
      return total;
    }
  

   /** cuadrado
    * Devuelve la potencia de un número elevado a 2
    * <p>
    * @param a número a calcular su cuadrado
    * @return  Devuelve la potencia de un número elevado a 2
    */

    public static int cuadrado(int x) {
      return (int)cuadrado((long)x);
    }


    /** cuadrado
    * Devuelve la potencia de un número elevado a 2
    * <p>
    * @param a número a calcular su cuadrado
    * @return  Devuelve la potencia de un número elevado a 2
    */

    public static long cuadrado(long x) {
      return potencia(x, 2);
    }

   /** cubo
    * Devuelve la potencia de un número elevado a 3
    * <p>
    * @param a número a calcular su cubo
    * @return  Devuelve la potencia de un número elevado a 3
    */

    public static int cubo(int x) {
      return (int)cubo((long)x);
    }

     /** cubo
    * Devuelve la potencia de un número elevado a 3
    * <p>
    * @param a número a calcular su cubo
    * @return  Devuelve la potencia de un número elevado a 3
    */

    public static long cubo(long x) {
      return potencia(x, 3);
    }

   
   /** esMultiplo
    * Indica si un número es múltiplo de otro dado
    * <p>
    * @param a valor a comprobar si es múltiplo
    * @param b valor con el que comprobar si a es múltiplo de él
    * @return  true si a es múltiplo y false en caso contrario
    */

    public static boolean esMultiplo(long x, long y) {
      return esIgual(resto(x, y), 0);
    }

    
   /** esMultiplo
    * Indica si un número es múltiplo de otro dado
    * <p>
    * @param a valor a comprobar si es múltiplo
    * @param b valor con el que comprobar si a es múltiplo de él
    * @return  true si a es múltiplo y false en caso contrario
    */

    public static boolean esMultiplo(int x, int y) {
      return esMultiplo((long)x, (long)y);
    }


   /** esDivisor
    * Indica si un número es divisor de otro dado
    * <p>
    * @param a valor a comprobar si es divisor
    * @param b valor con el que comprobar si a es divisor de él
    * @return  true si a es divisor y false en caso contrario
    */
    
    public static boolean esDivisor(long x,long y) {
      return esMultiplo(y, x);
    }
    
    /** esDivisor
     * Indica si un número es divisor de otro dado
     * <p>
     * @param a valor a comprobar si es divisor
     * @param b valor con el que comprobar si a es divisor de él
     * @return  true si a es divisor y false en caso contrario
     */


    public static boolean esDivisor(int x,int y) {
      return esDivisor((long)x,(long) y);
    }
   
   /** esPrimo
    * Indica si un número es primo
    * <p>
    * @param a número a comprobar si es primo
    * @return  true si a es primo y false en caso contrario
    */

    public static boolean esPrimo(int x) {
      return esPrimo((long)x);
    }

    /** esPrimo
    * Indica si un número es primo
    * <p>
    * @param a número a comprobar si es primo
    * @return  true si a es primo y false en caso contrario
    */

    public static boolean esPrimo(long x) {
      if(esMenor(x, 2)){
        return false;
      }
      long contador=2;
      while(esMenor(contador, x)){
        if (esIgual(resto(x, contador),0)){
          return false;
        }
        contador=inc(contador);
      }
      return true;
    }
   
  
   /** esCuadradoPerfecto
    * Indica si un número es cuadrado perfecto
    * <p>
    * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
    * @param a número a comprobar si cuadrado perfecto
    * @return  true si a es cuadrado perfecto y false en caso contrario
    */

    public static boolean esCuadradoPerfecto(int x) {
      return esCuadradoPerfecto((long)x);
    }


    /** esCuadradoPerfecto
    * Indica si un número es cuadrado perfecto
    * <p>
    * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
    * @param a número a comprobar si cuadrado perfecto
    * @return  true si a es cuadrado perfecto y false en caso contrario
    */

    public static boolean esCuadradoPerfecto(long x) {

      long comprobante=2;//ire poniendo al cuadrado este numero hasta que llegue a la mitad de x si coincide con algun numero es cuadrado perfecto

      while(esMayor(divide(x, 2),comprobante)){
          if(esIgual(cuadrado(comprobante),x)){
            return true;
          }
          comprobante=inc(comprobante);
        }
        return false;
    }

}