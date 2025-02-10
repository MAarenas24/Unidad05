package com.mycompany.maac.maac;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum ValoresBaraja {
    AS(14, "A"),
    DOS(2, "2"),
    TRES(3, "3"),
    CUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SIETE(7, "7"),
    OCHO(8, "8"),
    NUEVE(9, "9"),
    DIEZ(10, "10"),
    JOTA(11, "j"),
    REINA(12, "Q"),
    REY(13, "K"),
    JOKER(0, "Joker");
    
    
    
    private int puntos;
    private String etiqueta;
    
    private ValoresBaraja(int puntos, String etiquetas) {
        this.puntos = puntos;
        this.etiqueta = etiquetas;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    
    
}
