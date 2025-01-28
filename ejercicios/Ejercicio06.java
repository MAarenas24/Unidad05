package unidad05.ejercicios;

import java.util.Arrays;

/**
 * Ordenar array gigante. Escribe un programa que defina un array de un millón
 * de números enteros y lo inicialice con valores aleatorios entre 0 y
 * 2.000.000. Posteriormente, el programa debe ordenar los elementos del array
 * de menor a mayor, de manera que el que ocupe la posición 0 sea el menor de
 * todos, el de la posición 1 sea el siguiente, y así sucesivamente. No utilices
 * los métodos de ordenación de la biblioteca de Java, sino que debes programar
 * uno tú mismo/a.
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        int[] arrayGigante = new int[10];

        for (int i = 0; i < arrayGigante.length; i++) {
            arrayGigante[i] = (int) (Math.random() * 2000001);
        }
        
        ordenarArray(arrayGigante);
        
        System.out.println(Arrays.toString(arrayGigante));

    }
    
    public static void ordenarArray(int[] array){
        for (int iteracion = 1; iteracion < array.length; iteracion++) {
            for (int posicionActual = array.length - 1; posicionActual >= iteracion; posicionActual--) {
                if (array[posicionActual - 1] > array[posicionActual]) {
                    int valorAux = array[posicionActual - 1];
                    array[posicionActual - 1] = array[posicionActual];
                    array[posicionActual] = valorAux;
                }
            }
        }
    }
}
