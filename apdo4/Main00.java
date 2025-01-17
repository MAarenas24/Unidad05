package unidad05.apdo4;

import java.util.ArrayList;
import unidad05.ejercicios.Neumatico;

/**
 * Podemos crear un ArrayList que contenga cualquier tipo de dato
 * @author Miguel Angel Arenas
 */
public class Main00 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        System.out.println("lista = " + lista);
        
        System.out.println("------------------");
        
        lista.add(9);
        lista.add("Anselmo");
        System.out.println("lista = " + lista);
        System.out.println("------------------");
        
        Neumatico neumatico = new Neumatico(23, 23, 1000);
        lista.add(neumatico);
        System.out.println("lista = " + lista);
    }
}
