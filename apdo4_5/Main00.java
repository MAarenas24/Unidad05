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
    }
    
}
