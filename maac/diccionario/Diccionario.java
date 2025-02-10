package com.mycompany.maac.diccionario;

import java.util.LinkedList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Diccionario {
    private LinkedList<Palabra> diccionario = new LinkedList<>();
    
    public void addPalabra(Palabra palabra, int numeroSignificado, Tipos tipoYGenero, String significado) {
        for (int i = 0; i < diccionario.size(); i++) {
            if (diccionario.get(i).equals(palabra)) {
                
            } else {
//                diccionario.add(new Palabra());
            }
        }
    }
    
    public void addPalabra(Palabra palabra, Tipos tipoYGenero, String significado) {
        
    }
    
    public void addSinonimo(Palabra palabra, int numeroAceptacion, String sinonimo) {
        for (int i = 0; i < diccionario.size(); i++) {
            if (diccionario.get(i).equals(palabra)) {
                diccionario.add(palabra);
            } else {
                
            }
        }
    }

    public void addAntonimo(Palabra palabra, int numeroAceptacion, String sinonimo) {
        
    }
    
    @Override
    public String toString() {
        return "Diccionario{" + "diccionario=" + diccionario.toString() + '}';
    }
}
