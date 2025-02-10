package com.mycompany.maac.maac;

import java.util.ArrayList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<>();
    private Carta joker;

    public Baraja() {
        for (int i = 0; i < 52; i++) {
            mazo.add(new Carta(PalosBaraja.PICAS, ValoresBaraja.AS));
        }
        
        mazo.add(new Carta());
    }
    
    public Carta getJoker() {
        return joker;
    }
    
    public boolean estaEnElMazo(Carta c) {
        for (int i = 0; i < mazo.size(); i++) {
            if (c.equals(mazo[i])) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hayJokerEnElMazo() {
        for (int i = 0; i < mazo.size(); i++) {
            if (mazo[i] == joker) {
                return true;
            }
        }
        return false;
    }
    
    public int getNumeroDeNaipes() {
        int contador = 0;
        while (contador < mazo.size()) {
            contador++;
        }
        return contador;
    }
    
    public void barajar() {
        ArrayList<Carta> mazoAux = new ArrayList<>();
        
        for (int i = 0; i < mazo.size(); i++) {
            int posicionAleatoria = (int) (Math.random() * mazo.size());
            mazoAux[posicionAleatoria] = mazo[i];
        }
        
    }
    
    public Carta repartir() {
        Carta cartaADevolver = mazo[0];
        return cartaADevolver
    }

    @Override
    public String toString() {
        return "Baraja { " + "mazo = [" + mazo + ", joker = " + joker + '}';
    }
    
    
    
}
