package array_list;
import java.util.ArrayList;
public class ArrayList_Avanzado {
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<> ();
         
        listado.add("Futbol");
        listado.add("Tennis");
        listado.add("Natacion");
        listado.add("Rugby");
        
        System.out.println("Cantidad " + listado.size());
        listado.forEach((deportes)->{
            System.out.println(deportes);
        });   
        
        if (listado.contains("Natacion")){
            System.out.println("Contiene Natacion");
        }
        
        listado.remove("Natacion");
        listado.remove(0);
        listado.add("Beisbol");
        
        System.out.println("Ahora quedaron solo " + listado.size());
        listado.forEach((deportes)->{
            System.out.println(deportes);
        });   
    }
}
