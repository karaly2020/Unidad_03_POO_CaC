/*Declara una clase que represente el tipo enumerado que define las posiciones de un equipo de fútbol
con los valores ARQUERO, DEFENSOR, MEDIOCAMPISTA y DELANTERO. Con esta especificación se deberá crear la 
clase enum denominada “Posicion”. Luego, cree la clase Futbolista cuyos atributos serán: nombre (String), 
numero (int), pos (Posicion). Instancie la clase Futbolista de forma tal de poder crear un jugador de fútbol. 
Ejemplo: Futbolista jug1 = new Futbolista("Juan Román Pérez", 10, Posicion.MEDIOCAMPISTA);*/
package ejercicio11;
public class Futbolista {
    public enum posicion {
       ARQUERO, DEFENSOR, MEDIOCAMPISTA, DELANTERO};

    public String nombre; 
    public int numero;
    private posicion pos; 

    posicion arquero= posicion.ARQUERO; 
    posicion defensor=posicion.DEFENSOR;
    posicion mediocampista=posicion.MEDIOCAMPISTA;  
    posicion delantero=posicion.DELANTERO; 

    //constructor
    public Futbolista(String nombre, int numero, posicion pos){
        this.nombre=nombre;
        this.numero=numero; 
        this.pos=pos; 
    }

    public posicion getPos() {
        return pos;
    }

    public void setPos(posicion pos) {
        this.pos = pos;
    }

    public String toString(){
        String mensaje="Futbolista "+nombre+ " numero: "+numero+ " Posicion: "+ getPos(); 
        return mensaje;
    }
}
    

