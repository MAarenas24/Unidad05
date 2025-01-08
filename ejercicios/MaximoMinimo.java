package unidad05.ejercicios;

/**
 * Crear dos metodo que acepte como parametro un array de enteros y devuelva
 * - Uno el maximo valor de todos
 * - El otro, el valor minimo
 * 
 * @author Miguel Angel Arenas
 */
public class MaximoMinimo {
    
    public static void main(String[] args) {
        
        int[] notas = {5, 9, 10, 3, 9};
        
        System.out.println("Valor maximo = " + maximo(notas));
        System.out.println("Valor minimo = " + minimo(notas));
    }
    
    public static int maximo(int[] array) { 
        int maximo = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
    
    public static int minimo(int[] array) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
    
}
