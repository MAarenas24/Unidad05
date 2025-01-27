package unidad05.ejercicios.ordenar02;

import java.util.Comparator;

/**
 *
 * @author Miguel Ángel Arenas
 */
public class CompararPorNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
    
    
    
}
