/*Declara una clase que represente el tipo enumerado que define tipos de madera con los valores ROBLE, CAOBA, 
NOGAL, CEREZO. Siendo sus pesos específicos 800, 770, 820 y 790 kg/m3 respectivamente. Crea un programa que muestre
el peso de los palets de cada uno de los tipos de madera. Nota: un palet admite 2.27 m3 de volumen por lo que el peso 
total del palet se calculará de la siguiente forma: 2.27 m3 * peso específico de la madera (en kg/ m3).*/
package ejercicio12;
public class Ejercicio_12 {
    enum Maderas {
        ROBLE(880),
        CAOBA(770),
        NOGAL(820),
        CEREZO(790);

    private  double peso;
    //constructor privado

    private Maderas(int peso){
            this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }

    }
}
