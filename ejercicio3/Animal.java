/*Cree la clase Animal con sus atributos raza (String) y nombre (String). Cree el método equals de esa clase 
para poder comparar un animal con otro. Para ser considerado el mismo animal, la raza y el nombre deberán ser 
iguales. Cree una clase ejecutable para verificar el correcto funcionamiento de la clase anteriormente creada.*/
package ejercicio3;
import java.util.Objects;

public class Animal {
    private String raza;
    private String nombre;

    public Animal(String raza, String nombre) {
        super ();
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            
            Animal otro = (Animal)obj;
            
            if(this.nombre == otro.nombre && this.raza == otro.raza){
                return true;
            }else{
                return false;
            }
               
        }else{
            return false;
        }
    }
}
        
    
    
    

    
    
    

