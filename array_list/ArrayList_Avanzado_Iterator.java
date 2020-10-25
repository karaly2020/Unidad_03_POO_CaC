package array_list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_Avanzado_Iterator {
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<> ();
         
        listado.add("Futbol");
        listado.add("Tennis");
        listado.add("Natacion");
        listado.add("Rugby");
        
//        System.out.println("Cantidad " + listado.size());
//        listado.forEach((deportes)->{
//            System.out.println(deportes);
//        }); 
        
        Iterator<String> deportes = listado.iterator();
        while(deportes.hasNext());
            System.out.println(deportes.next());
    }
}
