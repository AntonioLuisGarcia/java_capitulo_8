/*
 *Ejercicio 15
 *Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Antonio Luis Garcia
 */
import matematicas.Varias;
public class ejercicio15{
   public static void main(String[] args){
    int contador=0;
    int numero=1;
    while(contador<99999){
        numero++;
        if(Varias.esCapicua(numero)){
            System.out.print(numero+", ");
        }
        contador++;
    }
}
}