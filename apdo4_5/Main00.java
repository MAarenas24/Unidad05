package unidad05.apdo4_5;

import java.util.HashSet;
import java.util.Set;

/**
 * veamos como funciona los objetos de tipo Set
 * @author Miguel Angel Arenas
 */
public class Main00 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> numerosLoteria = new HashSet<>();
        numerosLoteria.add(45);
        numerosLoteria.add(46);
        numerosLoteria.add(47);
        numerosLoteria.add(48);
        
        //Si intento meter valores que ya estan no se repite
        numerosLoteria.add(45);
        numerosLoteria.add(46);
        numerosLoteria.add(47);
        numerosLoteria.add(48);
        
        System.out.println(numerosLoteria.toString());
        
        System.out.println("---------------------");
        
        HashSet<Persona> listaPersona = new HashSet<>();
        listaPersona.add(new Persona("Pepe", 15, "1111A"));
        listaPersona.add(new Persona("Pepe", 15, "1111A"));
        
        System.out.println("listaPersonas = " + listaPersona);
        System.out.println("Hash de Pepe = " + "Pepe".hashCode());
        System.out.println("Hash de 1111A = " + "1111A".hashCode());
    }
    
}
