package com.mycompany.maac.maac;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    public static void main(String[] args) {
        //La baraja se crea correctamente y muestra el contenido del mazo.
        Baraja baraja = new Baraja();
        System.out.println(baraja.toString());
        //Imprime el número de naipes de la baraja.
        System.out.println("Numero de naipes: " + baraja.getNumeroDeNaipes());
        //Permite barajar el mazo y muestra el contenido del mazo.
        
        //Indica si el joker está en la baraja.
        System.out.println(baraja.hayJokerEnElMazo());
        //Reparte una mano de 5 cartas (que se guardan en un array) y muestra el contenido de la mano.
        
        //Dicha mano se ordena para ver las cartas ordenadas por su valor y muestra el contenido de la mano.
        
        //Indica si el joker está en la baraja
        
    }
}
