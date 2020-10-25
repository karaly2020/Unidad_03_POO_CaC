/*Crea una clase cuyo método main ejecute una comparación letra a letra usando equals de dos palabras usando bucles. 
Ejemplo: si las palabras son “avispa” y “ave” el programa debe dar como resultado: ¿Letra 1 igual en las dos palabras? 
True. ¿Letra 2 igual en las dos palabras? True ¿Letra 3 igual en las dos palabras? False ¿Letra 4 igual en las dos palabras? 
La palabra 2 no tiene letra 4 ¿Letra 5 igual en las dos palabras? La palabra 2 no tiene letra 5 ¿Letra 6 igual en las 
dos palabras? La palabra 2 no tiene letra 6. */
package ejercicio2;
import java.util.Scanner;
public class Ejercicio_2_Palabras {
    private String palabra1;
    private String palabra2;     
    
    public void comparacion (){
        //Tomamos las palabras por pantalla y la asignamos a las variables de la Clase Palabras
        Scanner tomaPalabra = new Scanner(System.in);
        System.out.print("Ingrese su Primer Palabra : ");
        palabra1 = tomaPalabra.nextLine();
        System.out.print("Ingrese su Segunda Palabra : ");
        palabra2 = tomaPalabra.nextLine();
        if (palabra1.length()==palabra2.length()){
            System.out.println("Tienen la misma cantidad de letras");
        }else{
            System.out.println("No tienen la misma cantidad de letras, por lo cual ya no son iguales");
        }
        String aux="";
        boolean res = false; 
        for(int i=0;i<palabra1.length();i++){
            //verificamos si el primer caracter de predeterminada
            //es igual al primero de entrada
            if(palabra1.charAt(i)==palabra2.charAt(i)){
                //si es asi guardamos ese concatenamos el caracter a la variable aux
                aux+=palabra1.charAt(i);
                res=true;
                System.out.println("¿La letra" + " " + (i+1) + " es igual en las dos palabras?" + " " + res);
            }else{
                res=false;
                System.out.println("¿La letra" + " " + (i+1) + " es igual en las dos palabras?" + " " + res);
            }
        }
        //al finalizar el bucle verificamos si la variable aux es
        //igual a la predeterminada
        
        if(aux.equals(palabra1)){
            System.out.println("Hasta la letra compartida, Son iguales");
        }else{
            System.out.println("Hasta la letra compartida, No son iguales");
        }
    }
}
    
