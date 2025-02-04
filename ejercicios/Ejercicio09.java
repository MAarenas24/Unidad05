package unidad05.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        int[] arrayCreciente = new int[10];

        for (int i = 0; i < arrayCreciente.length; i++) {
            arrayCreciente[i] = (int) (Math.random() * 100) + 1;
        }
        
        System.out.println(Arrays.toString(arrayCreciente));
        
        ordenarArray(arrayCreciente);

        System.out.println(Arrays.toString(arrayCreciente));

        System.out.println("Introduce un numero entre 1 y " + arrayCreciente[9]);
        int numero = Integer.parseInt(entradaTeclado.nextLine());
        
        if (numero < 1 || numero > arrayCreciente[9]) {
            System.out.println("ERROR!! Numero incorrecto");
        } else {
            arrayCreciente[arrayCreciente.length - 1] = numero;
            ordenarArray(arrayCreciente);
        }
        
        System.out.println(Arrays.toString(arrayCreciente));
        
    }

    public static void ordenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int elementoAux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = elementoAux;                                                                                   
                }
            }
        }
    }

}
