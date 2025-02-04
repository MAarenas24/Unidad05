package unidad05.ejercicios.ejercicioClase01;

import java.util.ArrayList;

/**
 *
 * @author tarde
 */
public class Main {
    
    public static void main(String[] args) {
        
        MiArray a = new MiArray(3);
        
        while (!a.estaLleno()) {
//            a.insertar();
            a.add(); 
        }
        
        System.out.println("El valor maximo es: " + a.max());
        a.aumentarLength();
        
//        a.insertar(7, -20);
        a.remove(67);
    }
    
}
