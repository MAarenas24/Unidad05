package unidad05;

import java.util.Arrays;

/**
 * Vamos a entender como funciona la clase ArrayList
 *
 * @author Miguel Angel Arenas
 */
public class Ejemplo05ArrayList {

    public static void main(String[] args) {

        int[] notas = new int[4];
        Arrays.fill(notas, 6);
        System.out.println("El array notas tiene " + notas.length + " elementos");
        System.out.println(Arrays.toString(notas));
        int longitudInicial = notas.length;
        int[] notasAux = new int[longitudInicial + 5];
        for (int i = 0; i < longitudInicial; i++) {
            notasAux[i] = notas[i];
        }
        notas = notasAux;
        notas[longitudInicial] = 7;
        System.out.println("El array notas tiene " + notas.length + " elementos");
        System.out.println(Arrays.toString(notas));
    }

}
