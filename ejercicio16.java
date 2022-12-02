/*
 *Ejercicio 16
 *Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Antonio Luis Garcia
 */
import matematicas.Varias;
public class ejercicio16{
   public static void main(String[] args){
    int contador=0;
    int numero=1;
    while(contador<1000){
        numero++;
        if(Varias.esPrimo(numero)){
            System.out.print(numero+", ");
        }
        contador++;
    }
}
}