/* Utilizar un Iterador para calcular el promedio de un conjunto de valores almacenados en 
un ArrayList.*/
package ejercicio10;
public class Ejercicio10_Main {
    public static void main(String[] args) {
        //punto 10
        Promedio mipromedio=new Promedio();
        mipromedio.llenarConCeros();
        mipromedio.llenarArray();
        //mipromedio.recorrerImprimir();
       System.out.println("El promedio es: "+mipromedio.calcularPromedio());
    }  
}
