/*Crear un ArrayList y llenarlo con al menos 10 nombres de personas. */
package ejercicio4;
import java.util.ArrayList;
public class Ejercicio_4 {
    public static void main(String[] args) {
       ArrayList<String> personas = new ArrayList<String> ();
        personas.add("Karen");
        personas.add("Alicia");
        personas.add("Juan");
        personas.add("Jose");
        personas.add("Facu");
        personas.add("Mauri");
        personas.add("Euge");
        personas.add("Cami");
        personas.add("Marco");
        personas.add("Sofi");
        
        System.out.println("Cantidad de personas:" + personas.size());
        
        for (String nombres : personas){ //for each
               System.out.println(nombres);
        }
    }
}
