package unidad05.ejercicios;

/**
 * Inicializar array (más complejo). 
 * Define dos arrayes de 100 números enteros, uno llamado pares
 * y otro impares. Inicializa el primero con los 100 primeros números pares 
 * positivos (es decir, pares[0] contendrá el valor 2, pares[1] contendrá el 
 * valor 4, pares[2] contendrá el valor 6, y así sucesivamente). Inicializa el 
 * segundo con los 100 primeros números impares positivos. Imprímelo por 
 * pantalla para comprobar que lo has hecho correctamente.
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        int contadorDePares = 2;
        int contadorDeImpares = 1;
        
        int[] pares = new int[100];
        int[] impares = new int[100];
        
        for (int i = 0; i < pares.length; i++) {
            pares[i] = contadorDePares;
            contadorDePares+=2;
        }
        
        System.out.println("Pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        
        for (int i = 0; i < impares.length; i++) {
            impares[i] = contadorDeImpares;
            contadorDeImpares+=2;
        }
        System.out.println("");
        System.out.println("Impares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
    
}
