package unidad05.ejercicios.ordenar;

import java.util.Arrays;
/**
 *
 * @author Miguel Ángel Arenas
 */
public class Main00 {
    public static void main(String[] args) {
        int[] numeros = {4, 6, 1, 9, 6, 3, 5};

        System.out.println("Array no ordenada");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        System.out.println("Array ordenado: ");
        Arrays.sort(numeros);
        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}
