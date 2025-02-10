package com.mycompany.maac.diccionario;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum Tipos {
    NOMBRE_MASCULINO("m."),
    NOMBRE_FEMENINO("f."),
    NOMBRE_MASCULINO_Y_FEMENINO("m. y f."),
    COLOQUIAL("coloq."),
    ADJETIVO("adj."),
    ADVERBIO("adv."),
    CONJUNCION_COPULATIVA("conj. copulat."),
    PREPOSICION("prep."),
    PREFIJO("pref."),
    SUFIJO("suf."),
    SINONIMO("sin."),
    ANTONIMO("ant.");
    
    private String tipo;
    
    private Tipos(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
