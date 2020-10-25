/*Dado un ArrayList con números, utilice un método que al digitar una posición reemplace el dato que contiene por 
uno ingresado por el usuario.*/
package ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posicion, numero;
        ArrayList<Integer> listado = new ArrayList<Integer>();
        listado.add(25);
        listado.add(1);
        listado.add(38);
        listado.add(-4);
        listado.add(314);
        
        System.out.println("Cantidad de numeros: " + listado.size());
        listado.forEach((numeros)->{
            System.out.println(numeros);
        }); 
        System.out.println("Ingrese la posicion que desee sustituir en el listado:");
        posicion = entrada.nextInt();
        listado.get(posicion);
                        
        System.out.println("Ingrese el numero que desee incluir en listado:");
        numero = entrada.nextInt();
        listado.set(posicion, numero);
                        
        System.out.println("Cantidad de numeros: " + listado.size());
        listado.forEach((numeros)->{
            System.out.println(numeros);
        }); 
    }
}
