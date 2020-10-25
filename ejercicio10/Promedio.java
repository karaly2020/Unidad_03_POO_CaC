package ejercicio10;
import java.util.*;
public class Promedio {
    ArrayList <Integer> numeros =new ArrayList <Integer>();  

    public void llenarConCeros(){

        for (int i=0; i<10; i++) { numeros.add(0);

        } };

    public void llenarArray(){//con aleatorios
        Random numAleatorio;
        numAleatorio = new Random ();

        for(int i=0; i<10; i++){
            numeros.set(i, numAleatorio.nextInt(100) );//i es la posicion y el 2do es el numero aleatorio
        }
        System.out.println(numeros);  //para que imprima como quedó una vez que ya asignó los numeros random
    }

    public double calcularPromedio(){
        Iterator<Integer>it=numeros.iterator();
        double suma=0; 
        double promedio; 

        while(it.hasNext()){
            suma=suma+it.next(); 
        }
        promedio=suma/numeros.size();
            return promedio;
    }
}
