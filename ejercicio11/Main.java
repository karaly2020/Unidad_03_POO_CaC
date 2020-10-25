package ejercicio11;
import ejercicio11.Futbolista.posicion;

public class Main {
    public static void main(String[] args) {
        
        Futbolista jug1=new Futbolista("Juan¨Perez", 10, posicion.MEDIOCAMPISTA);
        Futbolista jug2=new Futbolista("Pablo Lopez", 9, posicion.DELANTERO); 
        Futbolista jug3=new Futbolista ("Roberto Fernandez", 4, posicion.DEFENSOR); 
        Futbolista jug4=new Futbolista ("Pedro Ferro", 2, posicion.ARQUERO);

        System.out.println(jug1.toString()); 
    }
}
