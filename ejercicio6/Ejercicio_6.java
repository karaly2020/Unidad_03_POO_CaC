/*Almacene en un ArrayList nombres de personas. Utilice un método que al digitar una posición 
muestre el dato que contiene. */
package ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        int posicion;
        ArrayList<String> personas = new ArrayList<String> ();
        personas.add("Karen");
        personas.add("Alcia");
        personas.add("Juan");
        personas.add("Jose");
                
        System.out.println("Cantidad de personas:" + personas.size());
        
        for (String nombres : personas){ //for each
               System.out.println(nombres);
        }
        System.out.println("Ingrese la posicion que desee ubicar en el listado");
        Scanner entrada = new Scanner(System.in);
        posicion = entrada.nextInt();
        
        System.out.println("La posicion ingresada contiene a: " + personas.get(posicion));
    }
}
