package unidad05.ejercicios.ordenar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Miguel Ángel Arenas
 */
//TODO Terminar con el github de clase
public class Main01 {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Pepe", "Lopez Martinez", 30, "11111111A", 87.4),
            new Persona("Jose", "Sanchez Mesa", 13, "11111111B", 102.54),
            new Persona("Anselmo", "Perez", 53, "11111111C", 96.56)
        };
        
        Arrays.sort(personas);
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("---------");
        }
        
        System.out.println("ARRAYLIST------------------------------------");
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepe", "Lopez Martinez", 30, "11111111A", 87.4));
        listaPersonas.add(new Persona("Jose", "Sanchez Mesa", 13, "11111111B", 102.54));
        listaPersonas.add(new Persona("Anselmo", "Perez", 53, "11111111C", 96.56));
        
        System.out.println("Listar personas sin ordenar");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("---------");
        }
        
        System.out.println("Listar personas ordenado");
        Collections.sort(listaPersonas);
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
        
    }
}
