package com.mycompany.maac.maac;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Carta {
    private PalosBaraja palo;
    private ValoresBaraja valor;

    public Carta(PalosBaraja palo, ValoresBaraja valor) {
        this.palo = palo;
        this.valor = valor;
    }
    
    public Carta() {
        this(eleguirPalo(), ValoresBaraja.JOKER);
    }

    /**
     * Este metodo eligira aleatoriamente entre corazones o diamantes, si el 
     * numero es un 0 va a ser corazones, en cambio, si es 1 va a ser diamantes
     * @return devuelve el palo de la carta
     */
    public static PalosBaraja eleguirPalo() {
        int numero = (int) (Math.random() * 2);
        if (numero == 0) {
            return PalosBaraja.CORAZONES;
        } else {
            return PalosBaraja.DIAMANTES;
        }
    }
    
    public PalosBaraja getPalo() {
        return palo;
    }

    public ValoresBaraja getValor() {
        return valor;
    }
    
    public boolean esJoker() {
        return valor == ValoresBaraja.JOKER;
    }
    
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (getClass() != o.getClass()) return false;
        
        Carta carta = (Carta) o;
        return this.palo == carta.palo 
                && this.valor == carta.valor;
    }
    
    public int hashCode() {
        int resultado = 17;
        int primo = 7;
        
        resultado = primo * resultado + valor.hashCode();
        resultado = primo * resultado + palo.hashCode();
        
        return resultado;
    }

    @Override
    public String toString() {
        return "palo = " + palo + "\n"
                + "valor = " + valor;
    }
    
    private boolean esMayorQue(Carta c) {
        if (c.valor == ValoresBaraja.JOKER || this.valor == ValoresBaraja.JOKER) {
            return false;
        }
        if (this.valor.getPuntos() > c.valor.getPuntos()) {
            return  true;
        }
        return false;
    }
    
    public boolean esIgualQue(Carta c) {
        if (c.valor == ValoresBaraja.JOKER && this.valor == ValoresBaraja.JOKER) {
            return true;
        }
        if (this.valor.getPuntos() == c.valor.getPuntos()) {
            return true;
        }
        return false;
    }
}
