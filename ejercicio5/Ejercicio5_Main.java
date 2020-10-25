/*Crear un ArrayList y llenarlo con 10 números aleatorios. Luego buscar un número ingresado por teclado. */
package ejercicio5;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5_Main {
    public static void main(String[] args) {
        int longitud = 10;
        int posicion, numero;
        ArrayList<Integer> listado = new ArrayList<Integer>();
        Random random = new Random();
            for(int i=0;i<longitud;i++){
                listado.add(random.nextInt(100));
            }   
        
        System.out.println("Cantidad de numeros: " + listado.size());
        listado.forEach((numeros)->{
            System.out.println(numeros);
        });      
        System.out.println("Ingrese el numero que desee ubicar en el listado");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();                       
            if (listado.contains(numero)){
                System.out.println("El numero " + numero + " se encuentra en el listado");
                posicion = listado.indexOf(numero);
                System.out.println("Se encuentra en la posicion " + posicion);
           }else{
                System.out.println("El numero no se encuentra en el listado ");
            }
    }
}

