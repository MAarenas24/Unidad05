package unidad05;

import java.util.Arrays;

/**
 * Clase Arrays
 * 
 * @author Miguel Angel Arenas
 */
public class Ejemplo04Arrays {
    
    public static void main(String[] args) {
        
        int[] edades = {34, 55, 61, 98, 12};
        
        printArray(edades);
        
        System.out.println("--------------------");
        
        System.out.println(Arrays.toString(edades));
        System.out.println("Busqueda Binaria sin ordenar: " + Arrays.binarySearch(edades, 98));
        
        
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("");
    }
    
}
