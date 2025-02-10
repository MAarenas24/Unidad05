package com.mycompany.maac.maac;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum PalosBaraja {
    CORAZONES("corazones", ColoresBaraja.ROJO),
    DIAMANTES("diamantes", ColoresBaraja.ROJO),
    PICAS("picas", ColoresBaraja.NEGRO),
    TREBOLES("tréboles", ColoresBaraja.NEGRO);
    
    private String nombre;
    private ColoresBaraja color;
    
    private PalosBaraja(String nombre, ColoresBaraja color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ColoresBaraja getColor() {
        return color;
    }
}
