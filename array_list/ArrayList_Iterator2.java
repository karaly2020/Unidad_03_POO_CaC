package array_list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_Iterator2 {
    public static void main(String[] args) {
       ArrayList<String> listado = new ArrayList<String>();
         
        listado.add("Futbol");
        listado.add("Tennis");
        listado.add("Natacion");
        listado.add("Rugby");
        
        Iterator<String> deportes = listado.iterator();
        
        while(deportes.hasNext());
            System.out.println(deportes.next());
    }
    
    
}
