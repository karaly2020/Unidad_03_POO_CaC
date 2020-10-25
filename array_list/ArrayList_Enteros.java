package array_list;
import java.util.ArrayList;
public class ArrayList_Enteros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(1);
        numeros.add(38);
        numeros.add(-4);
        numeros.add(314);
        
        System.out.println("Cantidad de numeros " + numeros.size());
        System.out.println(numeros.get(3));
    }
}
