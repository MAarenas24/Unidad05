package unidad05.ejercicios;

import java.util.Arrays;

/**
 * Buscar en array gigante. En el array generado en el ejercicio anterior, pide 
 * al usuario que introduzca un número entre 0 y 2.000.000. El programa debe 
 * buscar ese número en el array, comunicando al usuario la posición que ocupa 
 * (si lo encuentra) o un mensaje de error (si no lo encuentra). Usa un array 
 * convencional y un ArrayList para comparar los tiempos de ejecución.
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        int[] arrayGigante = new int[100];

        for (int i = 0; i < arrayGigante.length; i++) {
            arrayGigante[i] = (int) (Math.random() * 1001);
        }
        
        ordenarArray(arrayGigante);
        
        System.out.println(Arrays.toString(arrayGigante));
        
        busquedaSecuencial(arrayGigante, 500);

        busquedaBinario(arrayGigante, 500);
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
    
    public static void busquedaSecuencial(int[] array, int numeroABuscar) {
        
        int i = 0;
        int posicion = -1;
        
        for (i = 0; i < array.length; i++) {            
            if (array[i] == numeroABuscar) {
                posicion = i;
                break;
            }
        }
        if (i >= array.length) {
            System.out.println("ERROR! No se encuentra el numero que quieres buscar");
        }
        if (i < array.length) {
            System.out.println(posicion);
        }
        /*
        Tambien se puede hacer asi:
        
        int i = 0;
        int posicion = -1;
        
        while ((i < array.length) && (posicion == -1)) {
            
            if (array[i] == numeroABuscar) {
                posicion = i;
            }
            
            i++;
        }
        if (i >= array.length) {
            System.out.println("ERROR! No se encuentra el numero que quieres buscar");
        }
        if (i < array.length) {
            System.out.println(posicion);
        }
        */
    }
    
    public static void busquedaBinario(int[] array, int numeroABuscar) {
        int izquierda = 0;
        int derecha = array.length - 1;
        boolean encontrado = false;
        int mitad = 0;
        int posicion = 0;
        
        while ((izquierda < derecha - 1) && (!encontrado)) {
            mitad = izquierda + ((derecha - izquierda) / 2);
            
            if (array[mitad] == numeroABuscar) encontrado = true;
            if (array[mitad] > numeroABuscar) derecha = mitad;
            if (array[mitad] < numeroABuscar) izquierda = mitad;
        }
        
        if (encontrado) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero no encontrado");
        }
    }
    
}
