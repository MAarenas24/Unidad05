package unidad05.ejercicios.practicar;

import java.util.ArrayList;

/**
 * EJERCICIO 4: Realizar un programa que permita gestionar jugadores de
 * baloncesto con la siguiente información: Nombre Edad NombreEquipo
 * NumCanastasIntroducidas Provincia Funciones: Introducir datos (usaremos una
 * estructura tipo List). Mostrar todos los jugadores. Consulta de los datos de
 * todos los jugadores a partir del nombre Consulta de jugador por provincia
 * Modificación de las canastas introducidas por un jugador. Mostrar jugadores
 * ordenados por provincias. Borrado del jugador con determinado rango de
 * canastas introducidas. Borrado toda la colección.
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio04 {

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public static void main(String[] args) {

        listaJugadores.add(new Jugador("Arenas", 19, "Real Madrid", 25, "Almeria"));
        listaJugadores.add(new Jugador("Lahoz", 20, "Blue lock", 2, "Motril"));
        listaJugadores.add(new Jugador("Valky", 23, "Shingeki Haters", 0, "Sevilla"));

        mostrarDatos("Lahoz");
    }

    public static void mostrarDatos(String nombre) {
        for (int i = 0; i < listaJugadores.size(); i++) {
            if (listaJugadores.get(i).getNombre().equals(nombre)) {
                System.out.println(listaJugadores.get(i).toString());
            }
        }
    }

}
