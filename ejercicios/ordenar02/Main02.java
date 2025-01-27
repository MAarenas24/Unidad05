package unidad05.ejercicios.ordenar02;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Miguel Ángel Arenas
 */
//TODO terminar con github de clase
public class Main02 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepe", "Lopez Martinez", 30, "11111111A", 87.4));
        listaPersonas.add(new Persona("Jose", "Sanchez Mesa", 13, "11111111B", 102.54));
        listaPersonas.add(new Persona("Anselmo", "Perez", 53, "11111111C", 96.56));
        
        System.out.println("Listar personas sin ordenar");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
            System.out.println("---------");
        }
        
        System.out.println("Listar personas ordenado");
        Collections.sort(listaPersonas, new CompararPorNombre());
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
