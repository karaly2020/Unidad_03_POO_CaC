package ejercicio3;
public class Ejercicio3_Main {
    public static void main(String[] args) {
        
        Animal animal_1 = new Animal ("labrador", "pepe");
        Animal animal_2 = new Animal ("labrador", "pepe");
        
        if (animal_1.equals(animal_2)){
            System.out.println("Es el mismo animal");
        }else{
            System.out.println("No es el mismo animal");
        }
    }
}
