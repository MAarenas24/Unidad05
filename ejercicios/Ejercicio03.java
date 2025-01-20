package unidad05.ejercicios;

/**
 * Primitiva. 
 * Escribe un programa que genere al azar una combinación para jugar a la 
 * lotería primitiva asegurándote de que ningún número se repite. Pista: puedes 
 * utilizar un array de 6 números enteros, asignando a cada posición un número 
 * entero aleatorio entre 1 y 49, y comprobando que el número asignado no es 
 * igual a ninguno de losasignados anteriormente
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio03 {
   
    public static void main(String[] args) {
        
        int[] primitiva = new int[6];
        
        for (int i = 0; i < primitiva.length; i++) {
            primitiva[i] = (int) (Math.random() * 49) + 1;
            boolean repetido;
        }
        
        for (int i = 0; i < primitiva.length; i++) {
            System.out.print(primitiva[i] + " ");
        }
        
    }
    
}
