/*Dado un ArrayList con números, desarrolle un método que muestre por pantalla el número mayor y otro método 
que muestre el menor de la lista. Utilice un Iterador para recorrer el ArrayList.*/
package ejercicio9;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio_9 {
    public static void main(String[] args) {
                
        ArrayList<Integer> listado = new ArrayList<Integer>();
        listado.add(25);
        listado.add(1);
        listado.add(38);
        listado.add(-4);
        listado.add(314);
        
        System.out.println("Cantidad de numeros: " + listado.size());
        System.out.println("Listado original:");
        listado.forEach((numeros)->{
            System.out.println(numeros);
        }); 
        
        Collections.sort(listado);
        System.out.println("Listado ordenado de menor a mayor:");
        listado.forEach((numeros)->{
            System.out.println(numeros);
            
         });  
        System.out.println("El numero menor del listado es: " + (Collections.min(listado)));
        System.out.println("El numero menor del listado es: " + (Collections.max(listado)));
    }
}
    