package ejercicio12;
import ejercicio12.Ejercicio_12.Maderas;
public class Main {
    public static void main(String[] args) {
        
        System.out.println( Maderas.ROBLE.name()+" "+ calcularPesoPallet(Maderas.ROBLE, 880));

         System.out.println (Maderas.CAOBA.name()+" "+ calcularPesoPallet(Maderas.CAOBA, 770)); 

         System.out.println( Maderas.NOGAL.name()+" "+ calcularPesoPallet(Maderas.NOGAL, 820));

         System.out.println (Maderas.CEREZO.name()+" "+ calcularPesoPallet(Maderas.CEREZO, 790)); 

         

    }

    public static double calcularPesoPallet(Maderas maderas, double peso){

        double pesoPallet=( 2.27 * peso); 

        return pesoPallet;

    }
        
    
    
}
