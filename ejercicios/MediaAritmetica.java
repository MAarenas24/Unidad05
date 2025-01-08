package unidad05.ejercicios;

/**
 * Crear un metodo que acepte como parametro un array de enteros y devuelva
 * la media aritmetica de sus valores
 * 
 * @author Miguel Angel Arenas
 */
public class MediaAritmetica {
    
    public static void main(String[] args) {
        
        int[] notas = {5, 9, 10, 3, 9};
        System.out.println(mediaAritmetica(notas));
        
    }
    
    public static double mediaAritmetica(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }
    
}
