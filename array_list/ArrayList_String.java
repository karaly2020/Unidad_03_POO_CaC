package array_list;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_String {
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<String>();
        listado.add("Peru");
        listado.add("Uruguay");
        listado.add("Chile");
        listado.add("Argentina");
        
        System.out.println("Cantidad " + listado.size());
        
           // for (int i=0; i<listado.size(); i++){
               // System.out.println(listado.get(i));
        
            for (String paises : listado){ //for each
               System.out.println(paises);
            }     
        }
    }
    
