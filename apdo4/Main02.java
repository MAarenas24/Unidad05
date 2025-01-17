package unidad05.apdo4;

import java.util.ArrayList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main02 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 10);
        Persona persona2 = new Persona("Pepe", 10);

        if (persona1.equals(persona2)) {
            System.out.println("Ambas personas son iguales");
        } else {
            System.out.println("Ambas personas noooo son iguales");
        }

        System.out.println("--------------------------");
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        System.out.println("listaPersonas = " + listaPersonas);

        Persona pers = new Persona("Pepe", 10);
        listaPersonas.remove(pers);
        System.out.println("listaPersonas = " + listaPersonas);

    }
}
